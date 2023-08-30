package org.testone.arraytwoexample;
public class ArrayTwo{
	public static void main(String...args){
	int[][]arrayTwo = {
						{7,67,3},
						{77,78,79,80},
						{11,12}
						{12,1,3}
					};
		
	System.out.println(arrayTwo);
	System.out.println("lenght of array is :"+arrayTwo.length);
	System.out.println("Printing elemetns with for loop");
	for(int parent=0;parent<arrayTwo.length;parent++){
		System.out.println();
		
		for(int child = 0;child<arrayTwo[parent].length;child++){
		System.out.println(parent+"has number of kids : ");
		System.out.println(arrayTwo[parent][child]);
		

		}
	}
	System.out.println("End of main method");



	}
}