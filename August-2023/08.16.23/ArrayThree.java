package org.test.arraythree;
public class ArrayThree{
	public static void main(String...args){
		System.out.println("start of main method");
		int[][][]c = new int[2][4][];
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[0][2]);
		System.out.println(c[1][1]);
		System.out.println(c[1][3]);
		System.out.println("End of main method");


	}
}