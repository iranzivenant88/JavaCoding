package org.testtwo;

import com.venant.threadexampletwo.ThreadTwo;

public class MainTwo {
    public static void main(String... args) {
        System.out.println("Start of Main Method");

        ThreadTwo t2 = new ThreadTwo();
        t2.start();
        t2.run();
        t2.run('a');
        t2.start('B');

        for (int i = 1; i <= 4; i++) {
            System.out.println("Executed by the main thread");
        }

        System.out.println("End of Main Method");
    }//end of main method
}//end of class mainTwo
