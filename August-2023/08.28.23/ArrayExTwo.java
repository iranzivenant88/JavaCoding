package org.testone.arrayexample;
public class ArrayExTwo{ 
public static void main(String[]venant){
	System.out.println("Start of main method");
	int[][]arrayOne = {
		{32,99,22,'A'},
		{32,99,22,'A'},
		{32,99,22,'A'}
	};
	System.out.println(arrayOne);
	System.out.println("Array Length is"+arrayOne.length);
	System.out.println("Print elements with for loop:");
	for(int parent=0;parent<arrayOne.length;parent++){
		System.out.println();
		for(int child = 0;child<arrayOne[parent].length;child++){
		System.out.println(parent+" has number of kids: ");
		System.out.println(arrayOne[parent][child]);
		System.out.println();
		}
		
		
	}
	System.out.println("End of main method");
}
}