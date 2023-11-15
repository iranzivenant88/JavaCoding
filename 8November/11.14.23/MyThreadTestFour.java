package com.testingfour;
import org.venant.threadexamplefour.MyThreadFour;

public class MyThreadTestFour {
    public static void main(String... args) {
        System.out.println("Main thread started executing!!");

        MyThreadFour m3 = new MyThreadFour();
        m3.run();

        Thread t1 = new Thread();
        t1.start();

        for (int i = 0; i <= 9; i++) {
            System.out.println("Hello");
        }

        System.out.println("End of main thread!");
    }
}
