package com.venant.threadexampletwo;

public class ThreadExampleTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 11; i++) {
            System.out.println("Non-Main thread is executing!!");
        }

        System.out.println("End of run() method");
    }
}
