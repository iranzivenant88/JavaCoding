package org.venant.testingthree;

import com.wyatt.bigwi.threadexamplethree.ThreadExThree;

public class TestThreadExThree {
    public static void main(String... args) {
        System.out.println("Current Thread is = " + Thread.currentThread().getName());
        System.out.println("Current Thread priority is = " + Thread.currentThread().getPriority());
        System.out.println("Start of Main Method");

        ThreadExThree t1 = new ThreadExThree();
        Thread t = new Thread(t1);
        t.start();

        Thread.currentThread().setPriority(6);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Executed by the :" + Thread.currentThread().getName());
        }

        System.out.println("Current Thread priority is : " + Thread.currentThread().getPriority());
        System.out.println("End of Main Method");
    }
}
