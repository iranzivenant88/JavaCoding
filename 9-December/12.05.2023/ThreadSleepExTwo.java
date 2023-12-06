package co.kyle.threadexampleone;
import co.us.bob.sleepexampleone.ThreadSleepExOne;

public class ThreadSleepExTwo extends ThreadSleepExOne {
    public int id;

    public ThreadSleepExTwo() {
        System.out.println("Start of ThreadSleepExTwo()");
        System.out.println("End of ThreadSleepExTwo()");
    }

    public ThreadSleepExTwo(String userName, int id) {
        super(userName);
        this.id = id;
        System.out.println("End of ThreadSleepExTwo()");
    }

    @Override
    public String toString() {
        System.out.println("Start of ThreadSleepExTwo toString()");
        String data = super.toString();
        return data + " Id is: " + id;
    }
}
