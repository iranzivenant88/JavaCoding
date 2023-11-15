package org.venant.threadexamplefour;

public class MyThreadFour implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 9; i++) {
            System.out.println("Child thread executing!!");
        }

        System.out.println("End of run() method");
    }
}
