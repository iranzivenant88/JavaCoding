package org.mainone.testone;

import com.venant.threadexampleone.MyThreadOne;

public class MyThreadTestOne {
    public static void main(String... args) {
        System.out.println("Start of Main Method");

        MyThreadOne t1 = new MyThreadOne();
        t1.start();// second thread is created here 
        //here we have two threads so far
        for (int i = 0; i <= 10; i++) {
            System.out.println("Executed by the main thread");
        }

        MyThreadOne t2 = new MyThreadOne(); 
        t2.start();// third thread is created here 
        // after here we have three threads 

        System.out.println("End of Main Method");
    }
}
