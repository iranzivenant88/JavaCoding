package com.wyatt.bigwi.threadexampletwo;

public class ThreadExTwo extends Thread {
    @Override
    public void run() {
        System.out.println("Current Thread is = " + Thread.currentThread().getName());

        int i = 0;
        while (i <= 10) {
            System.out.println("Executed by the " + Thread.currentThread().getName());
            i++;
        }
        System.out.println(Thread.currentThread().getPriority());
    }
}
