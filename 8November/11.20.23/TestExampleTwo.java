package com.venant.testingtwo;
import com.wyatt.bigwi.threadexampletwo.ThreadExTwo;

public class TestExampleTwo {
    public static void main(String... args) {
        System.out.println("Start of Main Method");
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
        System.out.println("Current Thread priority is: " + Thread.currentThread().getPriority());
        ThreadExTwo t1 = new ThreadExTwo();
        t1.start();

        for (int i = 0; i <= 7; i++) {
            System.out.println("Executed by the " + Thread.currentThread().getName());
        }

        System.out.println("End of Main Method");
    }
}
