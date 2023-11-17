package com.venant.threadexampleone;

public class ThreadOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 11; i++) {
            System.out.println("Job of the child or user-defined thread!");
        }

        System.out.println("End of run() method");
    }
}
