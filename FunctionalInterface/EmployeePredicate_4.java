package FunctionalInterface;
import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate_4 {

    public static void main(String[] args) {

        ArrayList<Employee_4> list = new ArrayList<>();

        list.add(new Employee_4(101, "Nithin", 9000));
        list.add(new Employee_4(102, "Rahul", 15000));
        list.add(new Employee_4(103, "Sneha", 8000));
        list.add(new Employee_4(104, "Kiran", 12000));
        list.add(new Employee_4(105, "Anjali", 7000));

        Predicate<Employee_4> salaryCheck = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        for (Employee_4 emp : list) {
            if (salaryCheck.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}