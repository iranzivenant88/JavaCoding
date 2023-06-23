
package com.bona;
import com.julius.Lawyer;

public class LawyerMain{
	public static void main(String...args){

	Lawyer l1 = new Lawyer();
	l1.setAge(30);
	int age = l1.getAge();

	l1.setName("Moses");
	String name = l1.getName();

	l1.setLegNumber(201);
	int legNumber = l1.getLegNumber();

	l1.setState("Idaho");
	String state = l1.getState();

		System.out.println("The lawyer legNumber is "+legNumber);
		System.out.println("The lawyer name is :"+name);
		System.out.println("The lawyer age is : "+age);
		System.out.println("The lawyer state is :"+state);
		

	}

}