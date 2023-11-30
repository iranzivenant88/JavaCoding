package org.testone;
import co.steve.waugh.exampleone.ThreadExOne;
import com.mark.waugh.exampletwo.ThreadExTwo;

public class ThreadTestOne {
    public static void main(String... args) {
        System.out.println(Thread.currentThread().getName());
        ThreadExOne.mt = Thread.currentThread();
        System.out.println("Start of Main Method");
        ThreadExOne t1 = new ThreadExOne();
        ThreadExOne t2 = new ThreadExOne(101, "James Gosling");
        ThreadExTwo t3 = new ThreadExTwo(102, "Patrick Naugthan", "New York");
        ThreadExTwo t4 = new ThreadExTwo();
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t4);
        tt1.start();
        tt2.start();
        int j = 0;
        while (j <= 0) {
            j++;
            System.out.println("While Loop executed by the " + Thread.currentThread().getName());
        }
        tt3.start();
        tt4.start();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println("End of Main Method");
    } // End of Main Method
}
