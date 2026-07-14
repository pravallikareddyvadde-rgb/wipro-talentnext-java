package Set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Nithin");
        employees.add("Rahul");
        employees.add("Sneha");
        employees.add("Kiran");
        employees.add("Anjali");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
