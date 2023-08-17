package org.test.arrayfour;
public class ArrayFour{
	public static void main(String...args){
		System.out.println("start of main method");
		int[][]h = new int[3][];
		h[0]= new int[1];
		h[1] =new int[2];
		h[2] = new int[3];
		System.out.println(h[0]);
		System.out.println(h[1]);
		System.out.println(h[2]);
		//System.out.println(h[0][3][1]);
		System.out.println("End of main method");


	}
}