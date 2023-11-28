package com.eric.threadexampleone;
public class ThreadExOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        int i = 0;
        while (i <= 7) {
            System.out.println("The Value is: " + i);
            ++i;
        }

        System.out.println(Thread.currentThread().getName() + " executing");
        System.out.println("End of run() method");
    }
}
