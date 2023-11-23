 package com.adam.testtwo;
 import com.steve.waugh.exampletwo.ThreadExTwo;

public class ThreadTestTwo {
    public static void main(String...args) {
        System.out.println(Thread.currentThread().getName() + " has started executing!");

        ThreadExTwo tt1 = new ThreadExTwo();
        Thread t1 = new Thread(tt1);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Executed by the: " + Thread.currentThread().getName());
        }

        System.out.println("Minimum Priority is: " + Thread.MIN_PRIORITY);
        System.out.println("Normal Priority is: " + Thread.NORM_PRIORITY);
        System.out.println("Maximum Priority is: " + Thread.MAX_PRIORITY);
    }
}
