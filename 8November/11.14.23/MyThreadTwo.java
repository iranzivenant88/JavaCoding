package org.venant.threadexampletwo;

public class MyThreadTwo implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("Implementing Runnable Interface");
        System.out.println("Start of run() method");

        for (int i = 0; i <= 6; i++) {
            System.out.println("User Defined is executing!!");
        }

        System.out.println("End of run() method");
    }
}
