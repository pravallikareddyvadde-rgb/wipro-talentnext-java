package List;

public class EmployeeMain_6 {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101, "Nithin", "nithin@gmail.com", "Male", 50000));
        db.addEmployee(new Employee(102, "Rahul", "rahul@gmail.com", "Male", 60000));
        db.addEmployee(new Employee(103, "Sneha", "sneha@gmail.com", "Female", 55000));

        System.out.println("All Employees:");
        db.showAllEmployees();

        System.out.println(db.showPaySlip(102));

        db.deleteEmployee(101);

        System.out.println("\nAfter Deleting Employee 101:");
        db.showAllEmployees();
    }
}