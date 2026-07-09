package StringBuffer;

import java.util.Scanner;

public class RemoveEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.substring(1, str.length() - 1));
        sc.close();
    }
}
