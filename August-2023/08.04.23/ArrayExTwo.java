package org.array.exampletwo;
public class ArrayExTwo{
	public static void main(String...args){
		byte[]variableOne = new byte[10];
		short[]variableTwo = new short[20];
		int[]variableThree = new int[40];
		long[]variableFour = new long[30];
		float[]variableFive = new float[23];
		double[]variableSix = new double[12];
		System.out.println("Variable One correspondding class name is :"+variableOne.getClass().getName());
		
		System.out.println("Variable Two correspondding class name is :"+variableTwo.getClass().getName());
		
		System.out.println("Variable Three correspondding class name is :"+variableThree.getClass().getName());
		
		System.out.println("Variable Four correspondding class name is :"+variableFour.getClass().getName());
		
		System.out.println("Variable five correspondding class name is :"+variableFive.getClass().getName());
		
		System.out.println("Variable Six correspondding class name is :"+variableSix.getClass().getName());
			System.out.println("End of main method");
		
	}
}