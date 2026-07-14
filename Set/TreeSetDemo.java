package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Java");
        ts.add("Python");
        ts.add("C");
        ts.add("C++");
        ts.add("SQL");

        System.out.println("Original TreeSet:");
        System.out.println(ts);

        System.out.println("\nReverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nContains Java? " + ts.contains("Java"));
        System.out.println("Contains HTML? " + ts.contains("HTML"));
    }
}
