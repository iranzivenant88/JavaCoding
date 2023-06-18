package venuste.theo;
import bala.subramaniam.Parent;

public class Child extends Parent{
	public static void main(String...bala){
		System.out.println("Main method starts");

		Parent p1 = new Parent();
			p1.m1();
			System.out.println(p1.age);
			System.out.println(p1.firstName);
	    System.out.println("Main method ends");

	}
}