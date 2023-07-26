package com.main.exampleone;
import com.parent.exampleone.ParentExOne;
import com.child.exampleone.ChildExOne;
public class MainOne{
	public static void main(String...venant){
		System.out.println("Start of Mina method");
		int variableOne;
		ParentExOne p1 = new ParentExOne();
		ChildExOne c1 = new ChildExOne();
		ChildExOne c2 = new ChildExOne("James Gosling", 61);
		p1.m1();
		p1.m1(45);
		String value = c1.m2();
		System.out.println("The value is = "+value);
		System.out.println("Parent ex one  details are  = "+p1);
		System.out.println("Child ex one details are  = "+c1);
		System.out.println("The Child ex one details is = "+c2);
		System.out.println("End of Main Method");


	}
}