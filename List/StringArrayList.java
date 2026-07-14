package List;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

    ArrayList<String> list = new ArrayList<>();

    public void addString(String str) {
        list.add(str);
    }

    public void printAll() {
        Iterator<String> itr = list.iterator();

        System.out.println("Elements in ArrayList:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {

        StringArrayList obj = new StringArrayList();

        obj.addString("Java");
        obj.addString("Python");
        obj.addString("C");
        obj.addString("C++");
        obj.addString("SQL");

        obj.printAll();
    }
}
