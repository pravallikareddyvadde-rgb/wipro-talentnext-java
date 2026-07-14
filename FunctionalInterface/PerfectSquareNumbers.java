package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PerfectSquareNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(4, 7, 9, 15, 16, 20, 25, 30, 36, 50));

        Predicate<Integer> isPerfectSquare = num -> {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        System.out.println("Perfect Square Numbers:");

        for (Integer num : numbers) {
            if (isPerfectSquare.test(num)) {
                System.out.println(num);
            }
        }
    }
}
