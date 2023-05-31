package com.employee;
public class Employee{
	public String name;
	public int age;

	public Employee(String name, int age){
	this.name = name;
	this.age = age;
	}
	public void sayHello(){
	System.out.println("Hello,how are you doing?");
	m1();
	}
	public static void m1(){
	System.out.println("m1-static method");
	}
}
