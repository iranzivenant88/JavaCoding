package org.venant.threadexampleone;

public class MyThread extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("Start of run() method");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Executed by the child thread");
        }
        System.out.println("End of run() method");
    }
}
