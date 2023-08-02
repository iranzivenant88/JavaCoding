package com.org.staticfinal.example;
public class TestThree{

	public static void main(String...args){
	Byte valueOne = 12;
	Short valueTwo = 13;
	Integer valueThree = 34;
	Long valueFour = 456L;
	Float valueFive = 23.3F;
	Double valueSix = 89.5D;
	Character valueSeven = 'A';
		System.out.println("Start of Main method");
		
		System.out.println("Byte Minimum value is ="+valueOne.MIN_VALUE);
		System.out.println("Byte Maximum value is ="+valueOne.MAX_VALUE);


		System.out.println("Short Minimum value is ="+valueTwo.MIN_VALUE);
		System.out.println("Short Maximum value is ="+valueTwo.MAX_VALUE);

		System.out.println("Integer Minimum value is ="+valueThree.MIN_VALUE);
		System.out.println("Integer Maximum value is ="+valueThree.MAX_VALUE);

		System.out.println("Long Minimum value is ="+valueFour.MIN_VALUE);
		System.out.println("Long Maximum value is ="+valueFour.MAX_VALUE);

		System.out.println("Float Minimum value is ="+valueFive.MIN_VALUE);
		System.out.println("Floar Maximum value is ="+valueFive.MAX_VALUE);

		System.out.println("Double Minimum value is ="+valueSix.MIN_VALUE);
		System.out.println("Double Maximum value is ="+valueSix.MAX_VALUE);

		System.out.println("Character Minimum value is ="+valueSeven.MIN_VALUE);
		System.out.println("Character Maximum value is ="+valueSeven.MAX_VALUE);
		System.out.println("End of main method");

	}
	
}