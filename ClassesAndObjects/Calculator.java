package ClassesAndObjects;

public class Calculator {

    // Power using int
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Power using double
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}
