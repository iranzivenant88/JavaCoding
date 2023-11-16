package org.maintwo.testtwo;

import com.venant.threadexampletwo.MyThreadExTwo;

public class MainTestTwo {
    public static void main(String... args) {
        MyThreadExTwo t1 = new MyThreadExTwo(); 
        t1.run();

        Thread t2 = new Thread(); 
        t2.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Main thread is executing!!");
        }

        System.out.println("End of Main Method");
    }
}
