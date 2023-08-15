package com.org.arrayexample.one;
public class TwoDExOne{
	public static void main(String...args){
		System.out.println("Start of Main method");
		int[][]i = new int[2][];
		i[0] = new int[2];
		i[1] = new int[3];
		System.out.println(i);
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println("End of Main method");
	}
}