package com.threadtesting.mainthree;
import org.venant.threadexamplethree.ThreadThree;
public class MyThreadTestThree{
        public static void main(String...args){
        System.out.println("Main thread started executing");
        ThreadThree t3 = new ThreadThree();
        t3.start();
        for(int i = 0;i<=10;i++){
            System.out.println("Child thread or user denifed thread is executing");
        }

        System.out.println("End of main thread!");
        }
}

