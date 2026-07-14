package List;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class EmployeeVector_7 {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Nithin", "nithin@gmail.com", "Male", 50000));
        employees.add(new Employee(102, "Rahul", "rahul@gmail.com", "Male", 60000));
        employees.add(new Employee(103, "Sneha", "sneha@gmail.com", "Female", 55000));

        System.out.println("Using Iterator");
        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            e.getEmployeeDetails();
        }

        System.out.println("Using Enumeration");
        Enumeration<Employee> en = employees.elements();

        while (en.hasMoreElements()) {
            Employee e = en.nextElement();
            e.getEmployeeDetails();
        }
    }
}
