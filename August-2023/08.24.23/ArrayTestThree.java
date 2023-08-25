package org.test.arrayexamplethree;
public class ArrayTestThree{
	public static void main(String...args){
	System.out.println("Start of main method");
	//definition or declaration 
		char[]arrayTwo;

		//instatiation or creating an object 
		arrayTwo = new char[5];
		arrayTwo[0] = 'J';
		arrayTwo[1]= 'a';
		arrayTwo[2] = 'm';
		arrayTwo[3] = 'e';
		arrayTwo[4] = 's';
		System.out.println(arrayTwo);
		System.out.println("length of the array is "+arrayTwo.length);
		for(int index = 0;index<arrayTwo.length;index++){
			System.out.println("The index is is :"+index);
			System.out.println("The element is :"+arrayTwo[index]);
		}
		System.out.println("End of main method");
	}
}