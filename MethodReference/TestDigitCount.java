package MethodReference;

public class TestDigitCount {

    public static void main(String[] args) {

        DigitInterface d = DigitCount::digitCount;

        System.out.println("Digits = " + d.count(123456));
    }
}
