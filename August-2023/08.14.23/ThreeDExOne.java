package com.org.arrayexampletwo;
public class ThreeDExOne{
	public static void main(String...args){
		System.out.println("Start of main method");
		int[][][] s = new int[2][][];
		s[0] = new int[3][];
		s[0][0] = new int[1];
		s[0][1] = new int[2];
		s[0][2] = new int[3];
		s[1] = new int[2][2];
		System.out.println(s[0]);
		System.out.println(s[0][0]);
		System.out.println(s[0][1]);
		System.out.println(s[0][2]);
		System.out.println(s[1]);
		System.out.println("End of main method");

	}
}