package com.venant.threadexampletwo;

public class ThreadTwo extends Thread {

    @Override
    public void run() {
        System.out.println("Start of run() method");
        for (int i = 1; i < 6; i++) {
            System.out.println("Executed by the child or user-defined thread");
        }
        System.out.println("End of run() method");
    }

    public void run(char c) {
        System.out.println("Start of run(char) parameter");
        System.out.println("End of run(char) parameter");
    }

    @Override
    public void start() {
        System.out.println("Start of start() method");
        for (int i = 7; i >= 5; i--) {
            System.out.println("Overriding the start() method");
        }
        System.out.println("End of start() method");
    }

    public void start(double d) {
        System.out.println("Start of start(double d) method");
        System.out.println("End of start(double d) method");
    }
}
