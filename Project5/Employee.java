package Project5;

public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private long mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, long mobileNumber,
                    String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15d %-30s %-15s",
                firstName, lastName, mobileNumber, email, address);
    }
}
