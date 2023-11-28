package co.us.david.testtwo.threadtesttwo;

import com.adam.robin.threadexampletwo.ThreadExTwo;

public class ThreadTestExTwo {
    public static void main(String... args) {
        System.out.println("Start of Main Method");
        System.out.println(Thread.currentThread().getName());

        ThreadExTwo t1 = new ThreadExTwo();
        Thread thread1 = new Thread(t1);
        thread1.start();

        Thread.currentThread().setPriority(4);

        Runnable t2 = new ThreadExTwo();
        Thread thread2 = new Thread(t2);
        thread2.start();
        Thread.yield();

        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName() + " is executing ");
        }

        ThreadExTwo t3 = new ThreadExTwo();
        Thread thread3 = new Thread(t3);
        thread3.start();

        System.out.println("End of Main Method");
    }
}
