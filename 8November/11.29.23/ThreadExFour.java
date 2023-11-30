package co.us.kyle.examplefour;

public class ThreadExFour implements Runnable {

    public String id;
    public String name;

    // Constructor without parameters
    public ThreadExFour() {
        System.out.println("Start of ThreadExFour()");
        System.out.println("End of ThreadExFour()");
    }

    // Constructor with parameters
    public ThreadExFour(int id, String name) {
        System.out.println("Start of ThreadExFour param constructor");
        this.id = Integer.toString(id); // Convert int to String
        this.name = name;
        System.out.println("End of ThreadExFour param constructor");
    }

    @Override
    public String toString() {
        System.out.println("Start of ThreadExFour toString() method");
        System.out.println("End of ThreadExFour toString() method");
        return "Id:" + id + " Name:" + name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <= 7; i++) {
            // Loop logic here
        }
        System.out.println("For Loop executed by: " + Thread.currentThread().getName());
        Thread.yield();
    }
}
