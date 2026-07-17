package ThreadControlAndPriorities;

class MyThread extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + " : " + i);

        }

    }

}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        System.out.println(t1.getName() + " Priority = " + t1.getPriority());
        System.out.println(t2.getName() + " Priority = " + t2.getPriority());
        System.out.println(t3.getName() + " Priority = " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

    }
}

