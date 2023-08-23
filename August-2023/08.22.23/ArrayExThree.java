package com.test.arrayexamplethree;
public class ArrayExThree{
	public static void main(String...args){
		System.out.println("Start of main method");
		int[][][]arrayTwo = new int[2][3][3];
		arrayTwo[0][0][2] = 'J';
		arrayTwo[1[1][1] = 98;
		arrayTwo[1][0][2] = 56;
		arrayTwo [0][3][2] = 67;
		arrayTwo [1][2][2] = 56;
		arrayTwo [0][0][1] =67;
	
	System.out.println(arrayTwo);
	System.out.println(arrayTwo[0][0][2]);
	System.out.println(arrayTwo[1][0][2]);
	System.out.println(arrayTwo[1][2][2]);
	System.out.println(arrayTwo[0][0][1]);
	System.out.println(arrayTwo[1][2][2]);
	System.out.println(arrayOne[0][0][1]);
	System.out.println("end of main method");
		
	}
}