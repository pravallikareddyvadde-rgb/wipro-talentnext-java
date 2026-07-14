package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    HashMap<String, Integer> contacts = new HashMap<>();

    // Add Contact
    public void addContact(String name, Integer phone) {
        contacts.put(name, phone);
    }

    // Check if key exists
    public boolean isKeyExists(String name) {
        return contacts.containsKey(name);
    }

    // Check if value exists
    public boolean isValueExists(Integer phone) {
        return contacts.containsValue(phone);
    }

    // Display all contacts using Iterator
    public void displayContacts() {

        Iterator<Map.Entry<String, Integer>> itr = contacts.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Name : " + entry.getKey() +
                               "  Phone : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        ContactList obj = new ContactList();

        obj.addContact("Nithin", 987654321);
        obj.addContact("Rahul", 987654322);
        obj.addContact("Sneha", 987654323);
        obj.addContact("Kiran", 987654324);

        System.out.println("Key Exists (Rahul): " + obj.isKeyExists("Rahul"));
        System.out.println("Key Exists (Ravi): " + obj.isKeyExists("Ravi"));

        System.out.println("Value Exists (987654323): " + obj.isValueExists(987654323));
        System.out.println("Value Exists (111111111): " + obj.isValueExists(111111111));

        System.out.println("\nContact List:");
        obj.displayContacts();
    }
}
