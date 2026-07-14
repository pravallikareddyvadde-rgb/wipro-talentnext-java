package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Nithin", 22, "Hyderabad"));
        list.add(new Employee(102, "Rahul", 23, "Pune"));
        list.add(new Employee(103, "Sneha", 21, "Chennai"));
        list.add(new Employee(104, "Kiran", 24, "Pune"));
        list.add(new Employee(105, "Anjali", 22, "Delhi"));

        List<Employee> puneEmployees = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        puneEmployees.forEach(System.out::println);
    }
}
