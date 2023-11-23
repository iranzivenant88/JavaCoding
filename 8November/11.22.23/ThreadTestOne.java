package org.wyatt.bigwi.testone;

import com.mark.waugh.exampleone.ThreadExOne;

public class ThreadTestOne {
    public static void main(String... args) {
        System.out.println(Thread.currentThread().getName() + " is executing");

        ThreadExOne t1 = new ThreadExOne();
        Thread tt1 = new Thread(t1);

        Runnable t2 = new ThreadExOne();
        Thread tt2 = new Thread(t2);

        Runnable t3 = new ThreadExOne();
        Thread tt3 = new Thread(t3);

        Thread.currentThread().setPriority(4);

        for (int i = 0; i <= 7; i++) {
            System.out.println(Thread.currentThread().getName() + " is executing the for loop ");
        }

        System.out.println(Thread.currentThread().getName() + " has finished executing!");

        tt1.start();
        tt2.start();
        tt3.start();

        System.out.println(Thread.currentThread().getName() + " is executing!! ");
        tt1.setPriority(7);
        tt2.setPriority(6);
        tt3.setPriority(9);

        System.out.println("Final Bye from : " + Thread.currentThread().getName());
    }//end of main method
}//end of class
