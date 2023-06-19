package org.test;
import ashley.sam.venu.ParentExOne;
public class MainExOne{
	public static void main(String[]args){
		System.out.println("Start of Main Method");
		ParentExOne pe = new ParentExOne();
		System.out.println("Parent Name is : "+pe.name);
		System.out.println("Parent Age is :"+pe.age);
		pe.m1();
		String userMessage = pe.sayHi("Venant is good ");
		System.out.println("The User Message is : "+userMessage);
		System.out.println("End of Main Method");
	}
}

