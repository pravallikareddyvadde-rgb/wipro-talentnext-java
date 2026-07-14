package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class SumOfNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        Function<ArrayList<Integer>, Integer> sumFunction = numbers -> {
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            return sum;
        };

        System.out.println("Numbers: " + list);
        System.out.println("Sum = " + sumFunction.apply(list));
    }
}
