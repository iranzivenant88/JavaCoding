package co.steve.waugh.exampleone;

public class ThreadExOne implements Runnable {

    public int userId;
    public String userName;
    public static Thread mt;

    // Constructor without parameters
    public ThreadExOne() {
        System.out.println("Start of ThreadExOne()");
        System.out.println("End of ThreadExOne()");
    }

    // Constructor with parameters
    public ThreadExOne(int userId, String userName) {
        System.out.println("Start of ThreadExOne param constructor");
        this.userId = userId;
        this.userName = userName;
        System.out.println("End of ThreadExOne param constructor");
    }

    @Override
    public String toString() {
        return "User Id: " + userId + ", User Name: " + userName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            mt.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i <= 7; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
