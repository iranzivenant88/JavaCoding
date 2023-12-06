package org.testone.mainone;
import co.us.bob.sleepexampleone.ThreadSleepExOne;
import co.kyle.threadexampleone.ThreadSleepExTwo;

public class ThreadTestOne {
    public static void main(String... args) {
        System.out.println(Thread.currentThread().getName() + " is executing ");

        ThreadSleepExOne ts1 = new ThreadSleepExOne();
        ThreadSleepExOne ts2 = new ThreadSleepExOne(" James");
        ThreadSleepExTwo ts3 = new ThreadSleepExTwo("Kyle", 101);
        ThreadSleepExTwo ts4 = new ThreadSleepExTwo();

        Thread t1 = new Thread(ts1);
        Thread t2 = new Thread(ts2);
        Thread t3 = new Thread(ts3);
        Thread t4 = new Thread(ts4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        for (int i = 0; i <= 9; i++) {
            System.out.println("Executed by the : " + Thread.currentThread().getName());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            int j = 0;
            while (j <= 5) {
                j++;
                System.out.println("Executed by the :" + Thread.currentThread().getName());
            }
        }
    }
}
