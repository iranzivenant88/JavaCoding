//public access modfier same classs 

package com.venant;

public class ParentOne{
	public static int age = 21 ;
	public static String name = "Venant";

	public static void m1(){
		System.out.println("m1-method");
	}


	public static void main(String...args){
		System.out.println("My age is :"+age);
		System.out.println("My name is :"+name);
		m1();
	}
}