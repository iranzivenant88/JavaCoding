package com.harris.parentexampleone;
public class ParentExOne{
	public void m1(String s){
	System.out.println("Start of m1() non static method of parentExOne");
	System.out.println("The Value of s is : "+s);
	System.out.println("End of m1() non static method of ParentExOne");
	}
	public static void m2(int i){
	System.out.println("Start of m2(int) static method of ParentExOne");
	System.out.println("The value of i is :"+ i);
	System.out.println("End of m2(Int) static method of ParentExOne");
	}

}