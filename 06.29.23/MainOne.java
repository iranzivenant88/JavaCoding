package com.main;
import harris.sam.org.ParentTwo;
import jack.com.eric.ChildTwo;
public class MainOne{
	public static void main(String...venant){
		System.out.println("Start of Main method");
		ParentTwo pt1 = new ParentTwo();
		ChildTwo ct1 = new ChildTwo();
		ct1.m1();
		System.out.println("End of main method");
	}
}