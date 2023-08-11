package org.com.arrayexampleone;
public class Student{
	public static void main(String...args){
		System.out.println("Start of main method");
		String[]studentNames;//defining or declaring an array
		studentNames = new String[5];////creation of an array/initialization of an array
		studentNames[0]="James Gosling";
		studentNames[1]="Patric Naughton ";
		studentNames[2]="Brenda Eich";
		studentNames[3]="Mark Andressen";
		studentNames[4]="Lars Bak";

		for(int i =0;i<studentNames.length;i++){
		System.out.println(studentNames[i]);
		}
		System.out.println("End of main method");


	}
}