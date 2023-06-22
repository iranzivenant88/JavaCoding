package com.tito;
import com.grace.Parent;

public class Child extends Parent{
	public static void main(String...args){
		Child c1 = new Child();
		System.out.println("The child's age "+c1.age);
		System.out.println("The child points's: "+c1.points);
		System.out.println("The child's name"+c1.name);
		System.out.println("The child's origin "+c1.country);

	}
}