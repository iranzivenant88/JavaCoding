package testthree.mainthree;
import org.eric.david.examplethree.ThreadExThree;

public class ThreadTestExThree {
    public static void main(String...args) {
        System.out.println(Thread.currentThread().getName() + " is running");

        Runnable tt1 = new ThreadExThree();
        Thread t1 = new Thread(tt1);

        ThreadExThree tt2 = new ThreadExThree();
        Thread t2 = new Thread(tt2);

        for (int i = 0; i <= 7; i++) {
            System.out.println(Thread.currentThread().getName() + " is executing!");
        }

        Thread.currentThread().setPriority(-3);
        t1.start();
        t2.start();
        
        t1.setPriority(12);
        t2.setPriority(11);

        System.out.println("End of Main Method");
    }
}
