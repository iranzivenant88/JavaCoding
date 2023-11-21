package com.testingone.testingexampleone;
import org.venant.wyatt.threadexampleone.ThreadExOne;

public class MainTestOne {
    public static void main(String... args) {
        System.out.println("Current Thread is : " + Thread.currentThread().getName());
        
        ThreadExOne t1 = new ThreadExOne();
        Thread t2 = new Thread(t1);
        
        System.out.println("Hello from " + Thread.currentThread().getName());
        t2.start();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println("Executed by the " + Thread.currentThread().getName() + " thread");
        }
        
        System.out.println("End of Main Method");
    }
}