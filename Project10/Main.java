package Project10;

import java.util.*;

public class Main {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // 1
        StringBuilder r1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            r1.append(s2);
        }
        list.add(r1.toString());

        // 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);
        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String ans = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(ans);
        } else {
            list.add(s1 + s2);
        }

        // 3
        if (first != last) {
            String ans = s1.substring(0, first) + s1.substring(first + s2.length());
            list.add(ans);
        } else {
            list.add(s1);
        }

        // 4
        int mid = (s2.length() % 2 == 0) ? s2.length() / 2 : s2.length() / 2 + 1;
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);
        list.add(firstHalf + s1 + secondHalf);

        // 5
        String ans5 = s1;
        for (char c : s2.toCharArray()) {
            ans5 = ans5.replace(c, '*');
        }
        list.add(ans5);

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        ArrayList<String> result = performOperations(s1, s2);

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
