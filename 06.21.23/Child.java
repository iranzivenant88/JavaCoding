/* different package sub class */
package com.tito;
import com.grace.Parent;

public class Child extends Parent{
	public static void main(String...args){
		Child c1 = new Child();
		c1.setPoints(20);
		int point = c1.getPoints();

		c1.setAge(21);
		int age = c1.getAge();

		c1.setName("Bala");
		String name = c1.getName();

		c1.setOrigin("India");
		String origin = c1.getOrigin();








		System.out.println("The child's age : "+age);
		System.out.println("The child points': "+point);
		System.out.println("The child's name : "+name);
		System.out.println("The child's origin:  "+c1.country);

	}
}