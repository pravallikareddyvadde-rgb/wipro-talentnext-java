package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("Java", "Python", "HTML", "CSS", "SQL",
                              "Spring", "Oracle", "React", "Linux", "Angular"));

        Consumer<String> reverseWord = word -> {
            String reverse = new StringBuilder(word).reverse().toString();
            System.out.println(reverse);
        };

        System.out.println("Reversed Words:");

        for (String word : words) {
            reverseWord.accept(word);
        }
    }
}
