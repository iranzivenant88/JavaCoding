package org.testone;
import com.james.gosling.threadexampleone.ThreadExampleOne;
public class ThreadTestOne {
    public static void main(String... args) {
        System.out.println("The Current thread is: " + Thread.currentThread().getName());
        ThreadExampleOne t1 = new ThreadExampleOne();
        Thread tt1 = new Thread(t1);
        tt1.start();
        for (int i = 0; i <= 6; i++) {
            System.out.println("For Loop is executed by: " + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing the main method");
    }// End of main method
}// End of class ThreadTestOne
