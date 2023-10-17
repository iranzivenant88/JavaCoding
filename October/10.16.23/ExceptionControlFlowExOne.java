package org.venant.exceptionflowone;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionControlFlowExOne
{
public static void main(String[] args){
System.out.println("Start of Main Method");
Scanner sc = null;
//boolean valueOne = false;
int valueOne = 0;
int valueTwo = 0;
int output = 0;
try{
sc = new Scanner(System.in);
System.out. println("Enter a integer positive value");
valueOne = sc.nextInt();
System.out. println("Enter another integer positive value");
valueTwo = sc.nextInt();
output = valueOne / valueTwo;
System.out. println("End of Main Method");
} // close of try block
catch(ArithmeticException ex){
ex.printStackTrace();
}
catch(InputMismatchException ex){
ex.printStackTrace();
}
catch(Exception ex){
 ex.printStackTrace();
 }
finally{
	System.out.println("Finally Block");
	try{
		if(sc!=null){
			sc.close();
		}
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
} // close of finally
} // close of main method
}// close of class