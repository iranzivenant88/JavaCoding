package org.chris.main.threadmainone;

import com.eric.threadexampleone.ThreadExOne;

public class ThreadMainOne {
    public static void main(String...args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Start of Main Method");

        ThreadExOne t1 = new ThreadExOne();
        ThreadExOne t2 = new ThreadExOne();
        Runnable t3 = new ThreadExOne();
        Runnable t4 = new ThreadExOne();

        Thread thread1 = new Thread(t3);
        Thread thread2 = new Thread(t1);
        Thread thread3 = new Thread(t2);

        thread3.start();
        
        System.out.println("Current thread is: " + Thread.currentThread().getName());

        for (int i = 0; i <= 9; i++) {
            System.out.println(Thread.currentThread().getName() + " is executing!");
        }

        thread2.start();

        System.out.println("Hi from " + Thread.currentThread().getName());

        //thread1.yield();
        Thread.yield();

        System.out.println("End of Main Method");
    }
}
