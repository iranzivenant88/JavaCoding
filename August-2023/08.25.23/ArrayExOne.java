package org.test.arrayexampleone;
public class ArrayExOne{
	public static void main(String...args){
	System.out.println("Start of main method");
	int [][]arrayOne = new int[2][3];
	arrayOne [0][0] = 'P';
	arrayOne [0][1] = 'S';
	arrayOne [0][2] = 987;
	arrayOne [1][0]= 33;
	arrayOne [1][1]= 986;
	arrayOne [1][2]= 'e';
	System.out.println("Array One length is :"+arrayOne.length);
		System.out.println("Display elements using loop:");
		for(int indexOne = 0;indexOne<arrayOne.length;indexOne++){
			System.out.println("");//For new line
			for (int indexTwo = 0;indexTwo<arrayOne.length;indexTwo++ ) {
				System.out.println(arrayOne[indexOne][indexTwo]);
			}
		}
	



}

}