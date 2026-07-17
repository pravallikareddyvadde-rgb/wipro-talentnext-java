package ThreadControlAndPriorities;

class PrintThread extends Thread {

    public void run() {

        for (int num = 1; num <= 10; num++) {

            System.out.println(num);

            if (num == 5) {

                try {
                    sleep(5000);
                }
                catch (InterruptedException e) {
                    System.out.println("Thread Interrupted");
                }

            }
        }
    }
}

public class PrintNumbers {

    public static void main(String[] args) {

        PrintThread t = new PrintThread();

        t.start();
    }
}
