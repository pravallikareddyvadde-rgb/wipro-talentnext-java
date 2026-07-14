package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Nithin");
        map.put("102", "Rahul");
        map.put("103", "Sneha");
        map.put("104", "Kiran");

        // a) Check if a particular key exists
        String key = "102";
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exists.");
        } else {
            System.out.println("Key " + key + " does not exist.");
        }

        // b) Check if a particular value exists
        String value = "Sneha";
        if (map.containsValue(value)) {
            System.out.println("Value " + value + " exists.");
        } else {
            System.out.println("Value " + value + " does not exist.");
        }

        // c) Iterate using Iterator
        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
