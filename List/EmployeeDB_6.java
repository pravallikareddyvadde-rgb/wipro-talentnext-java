package List;

import java.util.Vector;

public class EmployeeDB_6 {

    Vector<Employee> employees = new Vector<>();

    public boolean addEmployee(Employee e) {
        return employees.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee e : employees) {
            if (e.empId == empId) {
                employees.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : employees) {
            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId +
                       "\nEmployee Name : " + e.empName +
                       "\nSalary : " + e.salary;
            }
        }
        return "Employee Not Found";
    }

    public void showAllEmployees() {
        for (Employee e : employees) {
            e.getEmployeeDetails();
        }
    }
}
