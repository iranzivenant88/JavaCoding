package com.venant.threadexampleone;

public class MyThreadOne extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Job of user-defined or child thread");
            System.out.println("The Value of i is = " + i);
        }

        System.out.println("End of run() method");
    }
}
