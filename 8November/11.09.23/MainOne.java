package org.main.exampleone;

import com.venant.threadexampleone.ThreadOne;

public class MainOne {
    public static void main(String... args) {
        System.out.println("Start of Main Method");

        ThreadOne t1 = new ThreadOne();
        t1.start();

        for (int i = 0; i <= 6; i++) {
            System.out.println("Executed by the main thread");
        }

        System.out.println("End of Main Method");
    }//end of main method
}//end of class MainOne
