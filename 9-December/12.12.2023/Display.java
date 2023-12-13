package com.kyle.google.threadexampletwo;
public class Display {
    //public synchronized void wish(String name) {
    public void wish(String name){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi, how are you doing?");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(name);
        }
    }
} // close of wish() method
  // close of class Display.

