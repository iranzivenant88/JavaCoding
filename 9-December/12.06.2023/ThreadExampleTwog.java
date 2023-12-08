package co.us.patrick.naughtan.threadexampletwo;

public class ThreadExampleTwo implements java.lang.Runnable {
    public int id;
    public String name;

    public ThreadExampleTwo(int id, String name) {
        System.out.println("Start of ThreadExampleTwo()");
        this.id = id;
        this.name = name;
        System.out.println("End of ThreadExampleTwo()");
    }

    @Override
    public String toString() {
        System.out.println("Start of toString() of ThreadExampleTwo");
        System.out.println("End of toString() of ThreadExampleTwo");
        return " Id is: " + id + " Name is: " + name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing the run() ");

        int j = 0;
        while (j <= 7) {
            ++j;
            Thread.yield();
            System.out.println(" While Loop is executed by :" + Thread.currentThread().getName());
            j++;
        }

            System.out.println("Start of executing For Loop by:" + Thread.currentThread().getName());
            for (int i = 0; i <= 9; i++) {
                System.out.println(" The Thread " + Thread.currentThread().getName() + " is inside the for loop");
                try {
                    System.out.println("Start of try block by " + Thread.currentThread().getName());
                    Thread.sleep(7000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.println(" The Value of i is : " + i);
                System.out.println("End of For Loop");
            }

            System.out.println("End of run()");
        }
}
