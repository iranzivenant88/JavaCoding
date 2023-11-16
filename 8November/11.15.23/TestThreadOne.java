package org.venant.threadtestexample;
import com.venant.threadexample.ThreadOne;

public class TestThreadOne{
	public static void main(String...args){
		System.out.println("Start of main method");

		ThreadOne t1 = new ThreadOne();
		Thread td1 = new Thread(t1);
			td1.start();

			for(int i = 0;i< 7;i++){
				System.out.println("Executed by the main thread");
			}

			ThreadOne t2 = new ThreadOne();
			Thread td2 = new Thread(t2);
			td2.start();

			for(int index = 1; index<=4 ; index++){
				System.out.println(" The current index is :" +index +" and is executed by main thread " );
			}

			System.out.println("End of main the main method");
	}
}