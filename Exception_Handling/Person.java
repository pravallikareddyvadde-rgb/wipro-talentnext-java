package Exception_Handling;

public class Person {

    public void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age should be 18 or above");
        } else {
            System.out.println("Age is valid");
        }
    }
}