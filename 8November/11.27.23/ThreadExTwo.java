package com.adam.robin.threadexampletwo;

public class ThreadExTwo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing!");

        for (int i = 0; i <= 9; i++) {
            System.out.println(Thread.currentThread().getName() + " is executing! ");
        }

        int i = 1;
        while (i <= 7) {
            System.out.println("Current Thread executing inside while loop: " + Thread.currentThread().getName());
            ++i;
        }

        System.out.println("End of run() method");
    }
}
