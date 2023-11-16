package org.mainthree.testthree;

import com.venant.threadexamplethree.ThreadExThree;

public class MainExThree {
    public static void main(String... args) {
        System.out.println("Start of Main Method");

        Thread t1 = new Thread(new ThreadExThree());
            t1.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Executed by main thread");
        }
    }
}
