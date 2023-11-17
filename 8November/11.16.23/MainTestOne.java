package org.venant.maintestone;

import com.venant.threadexampleone.ThreadOne;

public class MainTestOne {
    public static void main(String... args) {
        System.out.println("Current Thread is : "+Thread.currentThread().getName());
        System.out.println("Start of Main Method");

        ThreadOne t1 = new ThreadOne();
        Thread t2 = new Thread(t1);
        t2.start();

        System.out.println("Thread Name is = " + t2.getName());
        //System.out.println("Thread Name is = " + t1.getName());

        System.out.println("End of Main Method");
    }
}
