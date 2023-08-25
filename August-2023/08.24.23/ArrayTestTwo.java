package org.test.arrayexampletwo;
public class ArrayTestTwo{
	public static void main(String...args){
	System.out.println("Start of main method");
		int[]arrayOne = new int[5];
		System.out.println(arrayOne);
		System.out.println(arrayOne.length);
		for(int index = 0;index<arrayOne.length;index++){
			System.out.println("The index is is :"+index);
			System.out.println("The element is :"+arrayOne[index]);
		}
		System.out.println("End of main method");
	}
}