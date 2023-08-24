package org.test.arrayexampletwo;
public class ArrayExTwo{
	public static void main(String...args){
	System.out.println("Start of main method");
	int [][][]arrayTwo = new int[4][3][2];
	arrayTwo[0][1][0] = 86;
	arrayTwo[2][2][0] = 'A';
	arrayTwo [3][1][1] = 'J';
	arrayTwo [2][2][0] = 76;
	arrayTwo [3][1][0] =45;
	arrayTwo [2][1][0] =99;
	
	System.out.println(arrayTwo[1][1][1]);
	System.out.println(arrayTwo[3][2][0]);
	System.out.println(arrayTwo[1][1][1]);
	System.out.println(arrayTwo[3][2][0]);
	System.out.println(arrayTwo[3][0][1]);
	System.out.println(arrayTwo[0][0][0]);

	System.out.println(arrayTwo);
	System.out.println(arrayTwo[1][2]);
	System.out.println(arrayTwo[2][2]);
	System.out.println(arrayTwo[3][2]);
	System.out.println(arrayTwo[0][0]);
	System.out.println(arrayTwo[2][2][2]);
	System.out.println("end of main method");

}

}