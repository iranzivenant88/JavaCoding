package org.venant.thread.test;
import com.venant.thread.ThreadExampleOne;
public class MainThread{
	public static void main(String...args){
		System.out.println("Current thread :"+Thread.currentThread().getName());
		System.out.println("Start of main method");

		ThreadExampleOne t1 = new ThreadExampleOne();
		Thread td = new Thread(t1);
		td.start();
		System.out.println("Current thread is :"+Thread.currentThread().getName());
		Thread.currentThread().setName("venant");
		System.out.println("current thread is :"+Thread.currentThread().getName());



	}
}