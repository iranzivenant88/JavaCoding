package com.array.test.exampleone;
public class ArrayExOne{
	public static void main(String...args){
		int[]array = new int[6];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		//array [2.5] = 50;
		array [3] = 56;
		array[4] = 60;
		array[5] = 70;
		array[6] = 80;
		System.out.println(array);
		for(int i = 0;i<7;i++){
			System.out.println("The value is="+array[i]);
		}
		System.out.println("End of main method");
	}
}