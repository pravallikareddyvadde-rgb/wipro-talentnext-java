package StringJoinerClass;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerDemo1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Pravallika");
        names.add("Phani");
        names.add("Raki");
        names.add("Ammulu");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        names.forEach(sj::add);

        System.out.println(sj);
    }
}