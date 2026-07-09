package StringBuffer;

import java.util.Scanner;

public class ConcatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String result;

        if (s1.charAt(s1.length() - 1) == s2.charAt(0))
            result = s1 + s2.substring(1);
        else
            result = s1 + s2;

        System.out.println(result.toLowerCase());
        sc.close();
    }
}
