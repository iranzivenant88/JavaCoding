package com.james.gosling.threadexampleone;
public class ThreadExampleOne implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <= 7; i++) {
            System.out.println("For Loop is executed by: " + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing the run() ");
    }// End of run() method
}// End of class ThreadExampleOne
