package com.mark.waugh.exampletwo;
import co.steve.waugh.exampleone.ThreadExOne;
public class ThreadExTwo extends ThreadExOne {

    public String userAddress;

    public ThreadExTwo() {
        System.out.println("Start of ThreadExTwo()");
        System.out.println("End of ThreadExTwo()");
    }

    public ThreadExTwo(int userId, String userName, String userAddress) {
        super(userId, userName);
        System.out.println("Start of ThreadExTwo param constructor");
        this.userAddress = userAddress;
        System.out.println("End of ThreadExTwo param constructor");
    }

    @Override
    public String toString() {
        String parentData = super.toString();
        return parentData + " User Address: " + userAddress;
    }
}
