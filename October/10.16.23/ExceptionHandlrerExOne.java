package com.venant.exceptionexampleone;
import java.util.Scanner;
public class ExceptionHandlrerExOne{
public static void main(String[]args) throws Exception{
	System.out.println("Start of main method");
	Scanner sc = null;
	sc = new Scanner(System.in);
	int  inputOne = 0;
	int inputTwo = 0;
	System.out.println("Enter a positive first number");
	inputOne = sc.nextInt();

	System.out.println("Enter a positive second number");

	inputTwo = sc.nextInt();

	int additionOutPut = add(inputOne , inputTwo);
	divide();
	System.out.println("End of main method");
}
public static int add(int valueOne,int valueTwo){
	System.out.println("Start of add() static method");
	int result = valueOne + valueTwo;
	return result;
}
	public static void divide() throws Exception{
	  int numberOne =10;
	  int numberTwo = 0;
	  int divideResult = numberOne/numberTwo;
	  System.out.println("Your Divide Result is : " +divideResult);
	}
}// close of class
