package org.test.arrayexampleone;
public class ArrayExOne{
	public static void main(String...args){
	int[][][]arrayOne;
	arrayOne = new int[3][4][4];
	arrayOne[0][2][3] = 'K';
	arrayOne[1][3][3] = 23;
	arrayOne[2][2][3] = 98;
	arrayOne[1][2][3] = 56;
	arrayOne[2][0][2] = 89;
	arrayOne[2][1][1] = 45;
	arrayOne[2][3][1] = 66;
	arrayOne[0][0][0] = 'z';
	arrayOne[3][3][1] = 77;
	arrayOne[2][1][0] = 1;
	System.out.println(arrayOne);
	System.out.println(arrayOne[2][0][2]);
	System.out.println(arrayOne[1][0][0]);
	System.out.println(arrayOne[2][2][3]);
	System.out.println(arrayOne[2][0][2]);
	System.out.println(arrayOne[1][1][1]);
	System.out.println(arrayOne[0][2][3]);
	System.out.println("End of main method");

}

}