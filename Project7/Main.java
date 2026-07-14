package Project7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Card> set = new TreeSet<>();

        boolean[] found = new boolean[256];
        int unique = 0;
        int count = 0;

        while (unique < 4) {

            System.out.println("Enter a card:");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            count++;

            if (!found[symbol]) {
                found[symbol] = true;
                unique++;
                set.add(new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are:");

        for (Card c : set) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}
