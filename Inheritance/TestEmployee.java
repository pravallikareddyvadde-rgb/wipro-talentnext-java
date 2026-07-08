package Inheritance;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Pravallika",
                600000,
                2026,
                "NI12346");

        System.out.println("Name : " + emp.getName());
        System.out.println("Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("Insurance Number : "
                + emp.getNationalInsuranceNumber());
    }
}
