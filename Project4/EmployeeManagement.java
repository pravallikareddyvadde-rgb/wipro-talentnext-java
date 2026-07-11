package Project4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

    static final String FILE_NAME = "employee.dat";

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list;

        File file = new File(FILE_NAME);

        if (file.exists()) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
                list = (ArrayList<Employee>) in.readObject();
                in.close();
            } catch (Exception e) {
                list = new ArrayList<>();
            }
        } else {
            list = new ArrayList<>();
        }

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    list.add(new Employee(id, name, age, salary));

                    try {
                        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
                        out.writeObject(list);
                        out.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 2:

                    System.out.println("-----Report-----");

                    for (Employee emp : list) {
                        System.out.println(emp);
                    }

                    System.out.println("-----End of Report-----");

                    break;

                case 3:

                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
