package org.venant.threadexamplethree;

public class ThreadThree implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("Implementing java.lang.Runnable Interface!!");

        for (int i = 0; i <= 4; i++) {
            System.out.println("Executed by the child thread or user-defined thread!!");
        }

        System.out.println("End of run() method!!");
    }
}
