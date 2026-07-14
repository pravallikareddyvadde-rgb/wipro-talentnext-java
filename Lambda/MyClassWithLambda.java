package Lambda;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = str -> {

            if (str == null || str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String text = "Java Lambda Expressions are easy";

        System.out.println("Number of Words : " + wc.count(text));
    }
}
