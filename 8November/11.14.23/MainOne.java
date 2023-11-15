package com.testingone.mainone;

import org.venant.threadexampleone.MyThread;


public class MainOne {
    public static void main(String... args) {
        System.out.println("Start of Main Method");

        MyThread m1 = new MyThread();
        m1.start();

        System.out.println("Hello from main thread");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Main thread executing");
        }

        m1.start(); 

        System.out.println("End of Main Method");
    }
}
