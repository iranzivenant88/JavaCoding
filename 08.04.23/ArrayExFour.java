package org.array.examplefour;
public class ArrayExFour{
	public static void main(String...args){
		byte[][]variableOne = new byte[1][1];
		short[][]variableTwo = new short[2][2];
		int[][]variableThree = new int[3][3];
		long[][]variableFour = new long[4][4];
		float[][]variableFive = new float[5][5];
		double[][]variableSix = new double[2][2];
		boolean[][]variableSeven = new boolean[3][3];
		System.out.println("Variable One correspondding class name is :"+variableOne.getClass().getName());
		
		System.out.println("Variable Two correspondding class name is :"+variableTwo.getClass().getName());
		
		System.out.println("Variable Three correspondding class name is :"+variableThree.getClass().getName());
		
		System.out.println("Variable Four correspondding class name is :"+variableFour.getClass().getName());
		
		System.out.println("Variable five correspondding class name is :"+variableFive.getClass().getName());
		
		System.out.println("Variable Six correspondding class name is :"+variableSix.getClass().getName());

		System.out.println("Variable Seven correspondding class name is :"+variableSeven.getClass().getName());
		
		System.out.println("End of main method");
		
	}
}