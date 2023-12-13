package org.testone;  

import com.venant.rwanda.threadexampleone.ThreadExampleOne;

public class ThreadTestOne {
    public static void main(String... args) {
        System.out.println(Thread.currentThread().getName() + " executing");

        ThreadExampleOne te1 = new ThreadExampleOne();
        Runnable te2 = new ThreadExampleOne();
        Thread t1 = new Thread(te1);
        Thread t2 = new Thread(te2);

        t1.start();
        t2.start();

        t1.interrupt();

        for (int i = 0; i <= 5; i++) {
            System.out.println("For Loop is executing: " + Thread.currentThread().getName());
        }
    }
}
