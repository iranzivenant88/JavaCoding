package org.eric.david.examplethree;

public class ThreadExThree implements Runnable {
    @Override
    public void run() {
        System.out.println("Start of run() method");

        for (int i = 0; i <= 9; i++) {
            System.out.println(Thread.currentThread().getName());
        }

        System.out.println("End of run() method");
    }
}
