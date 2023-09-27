package org.venant.example.exceptionone;
import java.util.Scanner;
public class TestOne{
	public static void main(String[]args){
		System.out.println("Start of Main Method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a negative decimal number");
		double valueOne = sc.nextDouble();
		System.out.println("Please Enter a O number to divide");
		double valueTwo = sc.nextDouble();
		try{
			System.out.println("Start try-clock");
			double result = valueOne/valueTwo;
			System.out.println("Your Result is : "+result);
			System.out.println("End of try-block");
		}
		catch(ArithmeticException  ex){
			ex.printStackTrace();
		}
		System.out.println("End Main Method");
	}
}