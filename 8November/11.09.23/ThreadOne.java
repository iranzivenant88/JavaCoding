package com.venant.threadexampleone;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("Start of run method");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Executed by the child thread or user-defined thread");
        }
        System.out.println("End of run method");
    }

    // @Override
    // public void start() {
    //     System.out.println("Start of start() method");
    //     System.out.println("End of start() method");
    // }
}
