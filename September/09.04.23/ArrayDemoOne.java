package org.venu.arrayexampleone;
public class ArrayDemoOne{
	public static void main(String...args){
	System.out.println("Start of main method");
	int[][][]x = {
					{
						{10,20,30},
						{20,50,60}

					},
					
					{

					{70,80},
					{90,100,110}

					}
	};
	System.out.println(x[0][1][2]);
	System.out.println(x[1][0][1]);
	System.out.println(x[2][0][0]);
	System.out.println(x[1][2][0]);
	System.out.println(x[1][1][1]);
	System.out.println(x[2][1][0]);
	System.out.println("End of main mehtod");
	}
}