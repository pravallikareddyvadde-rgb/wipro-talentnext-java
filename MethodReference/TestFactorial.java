package MethodReference;

public class TestFactorial {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        FactorialInterface f = obj::factorial;

        System.out.println("Factorial = " + f.calculate(5));
    }
}
