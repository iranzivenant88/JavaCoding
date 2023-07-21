import java.util.*;
import java.time.LocalDate;

public class ScannerClass{
	public static void main(String...args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();

		System.out.println("How old are you?");

		int age = scanner.nextInt();
		int yearOfBirth = LocalDate.now().minusYears(age).getYear();
		System.out.println("You were born in  "+yearOfBirth+ " and" );

		if(age<18){
			System.out.println("You're a minor):");
		}else{
			System.out.println("You're an adult(:");
		}
		
	}
}