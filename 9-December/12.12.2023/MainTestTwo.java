package org.testtwo;

import com.kyle.google.threadexampletwo.ThreadExampleTwo;
import com.kyle.google.threadexampletwo.Display;

public class MainTestTwo {
    public static void main(String... args) {
        System.out.println(Thread.currentThread().getName() + " executing main");

        Display d1 = new Display();

        ThreadExampleTwo tel = new ThreadExampleTwo(d1, "Patrick");
        Runnable te2 = tel;
        Thread t1 = new Thread(te2);
        t1.start();

        ThreadExampleTwo te3 = new ThreadExampleTwo(d1, "Harris");
        Runnable te4 = te3;
        Thread t2 = new Thread(te4);
        t2.start();

        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("Executing while loop" + Thread.currentThread().getName());
        }
    }
}
