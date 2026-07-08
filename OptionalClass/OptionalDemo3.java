package OptionalClass;

import java.util.Optional;

public class OptionalDemo3 {

    public static void main(String[] args) {

        Employee emp = null;

        Employee employee = Optional.ofNullable(emp)
                .orElseThrow(() ->
                        new InvalidEmployeeException("Employee is null"));

        System.out.println(employee.getName());
    }
}