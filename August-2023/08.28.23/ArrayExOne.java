package com.testone.arrayexample;
public class ArrayExOne{
	public static void main(String...args){
	int[][]arrayOne = new int[3][4];
	arrayOne[0][0] = 32;
	arrayOne[0][1] = 99;
	arrayOne[0][2] = 22;
	arrayOne[0][3] = 'A';
	arrayOne[1][0] = 'B';
	arrayOne[1][1] = 78;
	arrayOne[1][2] = 89;
	arrayOne[1][3] = 56;
	arrayOne[2][0] = 'a';
	arrayOne[2][1] = 'b';
	arrayOne[2][2] = 'b';
	arrayOne[2][3] = 'K';
	System.out.println(arrayOne);
	System.out.println("lenght of array is :"+arrayOne.length);
	System.out.println("Printing elemetns with for loop");
	for(int parent=0;parent<arrayOne.length;parent++){
		System.out.println();
		
		for(int child = 0;child<arrayOne[parent].length;child++){
		System.out.println(parent+"has number of kids : ");
		System.out.println(arrayOne[parent][child]);
		

		}
	}
	System.out.println("End of main method");



	}
}