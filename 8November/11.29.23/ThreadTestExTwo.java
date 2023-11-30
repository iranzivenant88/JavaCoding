package org.testtwo;
import co.us.kyle.examplefour.ThreadExFour;

public class ThreadTestExTwo {
    public static void main(String... args) {
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
        
        ThreadExFour e1 = new ThreadExFour();
        ThreadExFour e2 = new ThreadExFour(201, "Kyle");
        
        Thread tt1 = new Thread(e1);
        Thread tt2 = new Thread(e2);
        
        tt1.start();
        tt2.start();
        
        int i = 0;
        while (i <= 5) {
            ++i;
            System.out.println("While Loop executed by: " + Thread.currentThread().getName());
        }
        
        System.out.println("End of Main Method");
    }
}
