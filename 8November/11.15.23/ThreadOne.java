package com.venant.threadexample;
public class ThreadOne implements Runnable{
	@Override
	public void run(){
		System.out.println("Start of run method");
		for(int i = 0;i<=5 ; i++){
			System.out.println("The value of i is :" +i);
		}
		System.out.println("End of run method");
	}
}