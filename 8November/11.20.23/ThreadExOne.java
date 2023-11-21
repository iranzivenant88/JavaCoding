package org.venant.wyatt.threadexampleone;

public class ThreadExOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
        System.out.println("Start of run() method");
        
        for (int i = 0; i <= 5; i++) {
            System.out.println("Executed by the child or user-defined thread!");
        }
        
        System.out.println("End of run() method");
    }
}