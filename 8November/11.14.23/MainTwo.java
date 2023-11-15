package com.testingtwo.maintwo;
import org.venant.threadexampletwo.MyThreadTwo;

public class MainTwo {
    public static void main(String... args) {
        System.out.println("Main thread started executing!!");

        Thread mt = new MyThreadTwo();
        Thread t1 = new Thread(mt);
        t1.start();

        for (int i = 0; i <= 6; i++) {
            System.out.println("Main thread executing!!");
        }

        System.out.println("Main thread finished executing!!");
    }
}
