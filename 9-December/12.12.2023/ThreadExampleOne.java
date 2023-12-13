package com.venant.rwanda.threadexampleone;

public class ThreadExampleOne implements Runnable {
    public int userId;
    public String userName;

    public ThreadExampleOne() {
        System.out.println("Start of ThreadExampleOne constructor");
        System.out.println("End of ThreadExampleOne constructor");
    }

    public ThreadExampleOne(int userId, String userName) {
        System.out.println("Start of ThreadExampleOne parameterized constructor");
        this.userId = userId;
        this.userName = userName;
        System.out.println("End of ThreadExampleOne parameterized constructor");
    }

    @Override
    public String toString() {
        System.out.println("Start of ThreadExampleOne toString() method");
        System.out.println("End of ThreadExampleOne toString() method");
        return " User Id: " + userId + " User Name: " + userName;
    }

    @Override
    public void run() {
        System.out.println("Start of run() method " + Thread.currentThread().getName() + " executing ");

        for (int i = 0; i <= 9; i++) {
            System.out.println(Thread.currentThread().getName() + " run executing ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                //System.out.println("I am interrupted!!");
                System.out.println(Thread.currentThread().getName()+"Interrupted!");
            }
        }
    }
}
