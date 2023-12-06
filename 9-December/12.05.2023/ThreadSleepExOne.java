package co.us.bob.sleepexampleone;

public class ThreadSleepExOne implements java.lang.Runnable {
    public String userName;

    public ThreadSleepExOne() {
        System.out.println("Start of ThreadSleepExOne()");
        System.out.println("End of ThreadSleepExOne()");
    }

    public ThreadSleepExOne(String userName) {
        System.out.println("Start of ThreadSleepExOne(param)");
        this.userName = userName;
        System.out.println("End of ThreadSleepExOne(param)");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing");
        System.out.println("User Name is = " + userName);
        for (int i = 0; i <= 7; i++) {
            System.out.println(Thread.currentThread().getName() + " executing ");
        }
        System.out.println("Finished executing the run() by " + Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        System.out.println("Start of ThreadSleepExOne toString()");
        System.out.println("End of ThreadSleepExOne toString()");
        return "User Name is = " + userName;
    }
}
