package com.wyatt.bigwi.threadexamplethree;

public class ThreadExThree implements Runnable {

    @Override
    public void run() {
        System.out.println("Current Thread is : " + Thread.currentThread().getName());

        for (int i = 0; i <= 7; i++) {
            System.out.println("Executed by the : " + Thread.currentThread().getName());
        }

        System.out.println("Current Thread : " + Thread.currentThread().getName() + " priority is : " +
                Thread.currentThread().getPriority());
    }
}
