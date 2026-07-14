package Lambda;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsLambda {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Java");
        a1.add("Python");
        a1.add("HTML");
        a1.add("CSS");
        a1.add("SQL");
        a1.add("Spring");
        a1.add("Oracle");
        a1.add("React");
        a1.add("Angular");
        a1.add("Linux");

        Collections.sort(a1, (s1, s2) -> s2.compareTo(s1));

        a1.forEach(System.out::println);
    }
}