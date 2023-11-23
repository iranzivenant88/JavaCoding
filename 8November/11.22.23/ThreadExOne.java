package com.mark.waugh.exampleone;

public class ThreadExOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");
        System.out.println("Current Thread is : " + Thread.currentThread().getName());

        for (int i = 0; i <= 5; i++) {
            System.out.println("The Current Thread is : " + Thread.currentThread().getName() + " is executing");
        }

        System.out.println(Thread.currentThread().getName() + " has finished executing the run() method ");
    }
}
