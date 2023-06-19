package com.bala;
import us.venant.Parent;

public class Child {
	public static void main(String...args){
		System.out.println("Main method starts here ");
		Parent p1 = new Parent();
		System.out.println(p1.m1());
		//p1.m1();
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println("Main method ends here !");


	}
}
