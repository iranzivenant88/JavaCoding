package com.venant.main.testexamplethree;
import com.venant.threadexamplethree.ThreadExampleThree;

public class ThreadMainExampleOne {
    public static void main(String... args) {
        System.out.println("Current Thread is = " + Thread.currentThread().getName());
        
        ThreadExampleThree t1 = new ThreadExampleThree();
        Thread t2 = new Thread(t1);
        t2.start();
        //Thread.currentThread().setName("James-Thread");
        
        System.out.println("Current Thread is = " + Thread.currentThread().getName());
        System.out.println("End of Main Method");
        System.out.println(10/0);
    }
}
