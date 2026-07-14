package List;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        // Number allows Integer, Float, Double, Long, etc.
        ArrayList<Number> list = new ArrayList<>();

        list.add(10);        // Integer
        list.add(25.5f);     // Float
        list.add(99.99);     // Double
        list.add(500L);      // Long
        list.add((short)20); // Short
        list.add((byte)5);   // Byte

        System.out.println("Numbers in the ArrayList:");

        for (Number n : list) {
            System.out.println(n);
        }

        // The following statements are invalid and will cause compile-time errors:
        // list.add("Java");
        // list.add(true);
    }
}
