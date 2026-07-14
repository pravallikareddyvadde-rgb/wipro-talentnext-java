package FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Nithin", "Hyderabad", 50000));
        employees.add(new Employee(102, "Rahul", "Pune", 45000));
        employees.add(new Employee(103, "Sneha", "Chennai", 55000));
        employees.add(new Employee(104, "Kiran", "Bangalore", 60000));
        employees.add(new Employee(105, "Anjali", "Delhi", 48000));

        ArrayList<String> locations = new ArrayList<>();

        Function<Employee, String> function = emp -> emp.location;

        for (Employee e : employees) {
            locations.add(function.apply(e));
        }

        System.out.println("Employee Locations:");
        locations.forEach(System.out::println);
    }
}
