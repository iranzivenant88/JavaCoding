package com.steve.waugh.exampletwo;

public class ThreadExTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("The run() method has been executed by the: " + Thread.currentThread().getName());

        for (int i = 0; i <= 6; i++) {
            System.out.println("It is executed by the: " + Thread.currentThread().getName());
        }

        System.out.println("The run() method has been finished by: " + Thread.currentThread().getName());
    }
}
