package com.venant.threadexampletwo;

public class MyThreadExTwo implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 10; i++) {
            System.out.println("The Value of i is = " + i);
        }

        System.out.println("End of run() method");
    }
}
