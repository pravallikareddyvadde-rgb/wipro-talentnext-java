package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("madam", "java", "level", "hello",
                        "radar", "world", "malayalam",
                        "apple", "noon", "code"));

        Predicate<String> isPalindrome = str -> {
            String rev = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(rev);
        };

        System.out.println("Palindrome Words:");

        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}
