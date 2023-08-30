package com.testone.arrayexample;
public class ArrayExOne{
	public static void main(String...args){
	int[][]arrayOne = new int[3][];
	arrayOne[0] = new int[3];
	arrayOne[1] = new int[4];
	arrayOne[2] = new int[3];
	arrayOne[0][0] = 'O';
	arrayOne[0][1] = 67;
	arrayOne[1][3] = 'I';
	arrayOne[1][0] = 'E';
	arrayOne[2][2] = 99;
	arrayOne[2][1] = 12;
	
	System.out.println(arrayOne);
	System.out.println("lenght of array is : "+arrayOne.length);
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