package com.test.org.arrayone;
public class ArrayExOne{
	public static void main(String...args){
	System.out.println("Start of Main method");
	int[][] s = new int[2][];
	s[0] = new int[2];
	s[0][0] =21;
	s[0][1] = 10;
	
	s[1] = new int[3];
	s[1][0] = 45;
	s[1][1] = 7;
	s[1][2] = 1;
	System.out.println(s);
	System.out.println(s[0]);
	System.out.println(s[0][0]);
	System.out.println(s[0][1]);
	
	System.out.println(s[1]);
	System.out.println(s[1][0]);
	System.out.println(s[1][1]);
	System.out.println(s[1][2]);
	System.out.println("End of main method");


	}
}