package com.test.arrayexampletwo;
public class ArrayExTwo{
	public static void main(String...args){
		System.out.println("Start of main method");
		int[][]arrayOne = new int[3][2];
		arrayOne[0][1] = 34;
		arrayOne[0][0] = 22;
		arrayOne[1][0] = 56;
		arrayOne [1][1] = 67;
		arrayOne [2.0][0] = 56;
		arrayOne [2.0][1.0] =67;
		arrayOne [2.0][2.0] = 'G';
	
	System.out.println(arrayOne);
	System.out.println(arrayOne[0][0]);
	System.out.println(arrayOne[1][0]);
	System.out.println(arrayOne[1][1]);
	System.out.println(arrayOne[2.0][0]);
	System.out.println(arrayOne[2.0][1.0]);
	System.out.println(arrayOne[2.0][2.0]);
		
	}
}