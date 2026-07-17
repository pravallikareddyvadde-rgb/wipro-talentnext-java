package ThreadCreation;

import java.util.Random;

class ColourThread implements Runnable {

    public void run() {

        String colours[] = {
                "white",
                "blue",
                "black",
                "green",
                "red",
                "yellow"
        };

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red found. Program stopped.");
                break;
            }
        }
    }
}

public class RandomColourRunner {

    public static void main(String[] args) {

        ColourThread c = new ColourThread();

        Thread t = new Thread(c);

        t.start();
    }
}
