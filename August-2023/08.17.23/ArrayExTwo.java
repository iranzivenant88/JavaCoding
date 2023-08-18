package com.test.org.arraytwo;
public class ArrayExTwo{
	public static void main(String...args){
	System.out.println("Start of Main method");
	int[][][] a = new int[2][][];
	a[0] = new int[3][];
	a[0][0] =new int[1];
	a[0][1] = new int[2];
	a[0][2] = new int[3];
	a[0][0][0] = 12;
	a[0][1][0] = 10;
	a[0][1][1] = 45;
	a[0][2][0] = 89;
	a[0][2][1] = 32;
	a[0][2][2] =67;
	System.out.println(a);
	System.out.println(a[0]);
	System.out.println(a[0][0]);
	System.out.println(a[0][1]);
	System.out.println(a[0]);
	System.out.println(a[0][0]);
	System.out.println(a[0][1]);
	
	System.out.println(a[0][2]);
	System.out.println(a[0][0][0]);
	System.out.println(a[0][1][1]);
	System.out.println(a[0][1][1]);
	System.out.println(a[0][2]);
	System.out.println(a[0][2][0]);
	System.out.println(a[0][2][1]);
	System.out.println(a[0][2][2]);


	a[1] = new int[2][2];
	a[1][0] =new int[2];
	a[1][1] = new int[2];
	a[1][0][0] = 101;
	a[1][0][1] = 234;
	a[1][1][0] = 43;
	a[0][1][1] = 45;
	a[1][1][1] = 77;
	
	System.out.println(a[1]);
	System.out.println(a[1][0]);
	System.out.println(a[1][1]);
	System.out.println(a[1][0][0]);
	System.out.println(a[1][0][1]);
	System.out.println(a[1][1][0]);
	System.out.println(a[1][1][1]);
	
	System.out.println("End of main method");


	}
}