package org.test.arrayexamplefour;
public class ArrayTestFour{
	public static void main(String...args){
	System.out.println("Start of main method");
		
		char[]arrayThree ={'a','e','i','o','u'};

		//arrayThree = {'a','e','i','o','u'};

		System.out.println(arrayThree);
		System.out.println("length of the array is "+arrayThree.length);
		for(int index = 0;index<arrayThree.length;index++){
			System.out.println("The index is is :"+index);
			System.out.println("The element is :"+arrayThree[index]);
		}
		System.out.println("End of main method");
	}
}