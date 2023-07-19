import java.util.*;
import java.time.*;
public class DateClass{
	public static void main(String...args){
		Date date = new Date();
		System.out.println("Current Date is :"+date);
		LocalDate lt = LocalDate.now();
		System.out.println("Local time is :"+lt);
	}
}