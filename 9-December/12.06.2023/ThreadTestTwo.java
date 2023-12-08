package org.testtwo;

import co.us.patrick.naughtan.threadexampletwo.ThreadExampleTwo;

public class ThreadTestTwo {
    public static void main(String... args) {
        System.out.println(" Current Thread is : " + Thread.currentThread().getName());
        System.out.println("Start of Main Method");

        ThreadExampleTwo tt1 = new ThreadExampleTwo();
        ThreadExampleTwo tt2 = new ThreadExampleTwo(101, "Patrick");

        Thread t1 = new Thread(tt1);
        Thread t2 = new Thread(tt2);

        t1.start();
        t2.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("For Loop is Executed by : " + Thread.currentThread().getName());
            try {
                t1.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

            int a = 0;
            while (a <= 9) {
                ++a;
                System.out.println("While Loop is executed by : " + Thread.currentThread().getName());
            }

            try {
                t2.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        System.out.println("End of Main Method");
    } // End of main method
} // End of class ThreadTestTwo
