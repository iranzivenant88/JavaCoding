package com.venant.threadexamplethree;

public class ThreadExampleThree implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 11; i++) {
            System.out.println("Hi from thread!!");
        }
    }
}
