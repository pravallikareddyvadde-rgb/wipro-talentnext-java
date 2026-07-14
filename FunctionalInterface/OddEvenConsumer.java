package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 15, 22, 31, 40, 57, 68, 79, 80, 95));

        Consumer<Integer> checkOddEven = num -> {
            if (num % 2 == 0)
                System.out.println(num + " is Even");
            else
                System.out.println(num + " is Odd");
        };

        System.out.println("Odd and Even Numbers:");

        for (Integer num : numbers) {
            checkOddEven.accept(num);
        }
    }
}
