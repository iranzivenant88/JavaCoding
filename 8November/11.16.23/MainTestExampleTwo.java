package org.venant.main.testexampletwo;
import com.venant.threadexampletwo.ThreadExampleTwo;
public class MainTestExampleTwo {
    public static void main(String... args) {
        System.out.println("Current Thread is = " + Thread.currentThread().getName());
        System.out.println("Start of main method");

        ThreadExampleTwo t2 = new ThreadExampleTwo();
        Thread t3 = new Thread(t2);
        ThreadExampleTwo t4 = new ThreadExampleTwo();
        Thread t5 = new Thread(t4);

        t3.start();
        t5.start();

        System.out.println("Thread is = " + t3.getName());
        System.out.println("Thread is = " + t5.getName());

        for (int i = 0; i <= 11; i++)
            System.out.println("Executed by the main thread");

        System.out.println("End of Main Thread");
    }
}
