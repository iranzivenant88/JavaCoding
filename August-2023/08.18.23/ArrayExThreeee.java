package com.arrayexampleone;
public class ArrayExThreeee{
	public static void main(String...args){
	System.out.println("Start of main method");
	int[][][]m = new int[4][][];
	m[0]= new int[2][];
	m[0][0] = new int[2];
	m[0][1] = new int[3];
	m[0][0][0] =12;
	m[0][0][1] = 20;
	m[0][1][0] = 2;
	m[0][1][1] = 3;
	m[0][1][2] = 5;

	System.out.println(m);
	System.out.println(m[0]);
	System.out.println(m[0][0]);
	System.out.println(m[0][1]);
	System.out.println(m[0][0][0]);
	System.out.println(m[0][0][1]);
	System.out.println(m[0][1][0]);
	System.out.println(m[0][1][1]);
	System.out.println(m[0][1][2]);

	m[1]= new int[1][4];
	m[1][0] = new int[4];
	m[1][0][0] =29;
	m[1][0][1] = 21;
	m[1][0][2] = 22;
	m[1][0][3] = 32;

	System.out.println(m[1]);
	System.out.println(m[1][0]);
	System.out.println(m[1][0][0]);
	System.out.println(m[1][0][1]);
	System.out.println(m[1][0][2]);
	System.out.println(m[1][0][3]);

	m[2]= new int[4][];
	m[2][0] = new int[1];
	m[2][1] = new int[2];
	m[2][2] = new int[1];
	m[2][3] = new int[2];
	m[2][0][0] =24;
	m[2][1][0] = 9;
	m[2][1][1] = 24;
	m[2][2][0] = 33;
	m[2][3][0] = 59;
	m[2][3][1] = 93;

	System.out.println(m[2]);
	System.out.println(m[2][0]);
	System.out.println(m[2][1]);
	System.out.println(m[2][2]);
	System.out.println(m[2][3]);
	System.out.println(m[2][0][0]);
	System.out.println(m[2][1][0]);
	System.out.println(m[2][2][0]);
	System.out.println(m[2][3][1]);


	m[3]= new int[3][];
	m[3][0] = new int[3];
	m[3][1] = new int[2];
	m[3][2] = new int[1];
	m[3][0][0] =9;
	m[3][0][1] = 1;
	m[3][0][2] = 2;
	m[3][1][0] = 32;
	m[3][1][1] = 32;
	m[3][2][0] = 32;
	System.out.println(m[3]);
	System.out.println(m[3][0]);
	System.out.println(m[3][1]);
	System.out.println(m[3][2]);
	System.out.println(m[3][0][0]);
	System.out.println(m[3][0][1]);
	System.out.println(m[3][0][2]);
	System.out.println(m[3][1][0]);
	System.out.println(m[3][1][1]);
	System.out.println(m[3][2][0]);

	System.out.println("end of main method");

	

	}
}