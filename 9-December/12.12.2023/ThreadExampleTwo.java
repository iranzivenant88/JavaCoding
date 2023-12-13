package com.kyle.google.threadexampletwo;

public class ThreadExampleTwo implements Runnable {
    Display d;
    String name;

    public ThreadExampleTwo(Display d, String name) {
        System.out.println("Start of ThreadExampleTwo constructor");
        this.d = d;
        this.name = name;
        System.out.println("End of ThreadExampleTwo constructor");
    }

    @Override
    public void run() {
        System.out.println("Start of run()");
        d.wish(name);
        System.out.println("End of run()");
    }
}
