package com.venant.threadexamplethree;

public class ThreadExThree implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Executed by child thread");
        }

        System.out.println("End of run() method");
    }
}
