package com.julius;
public class Lawyer{
	int legNumber = 2;
	protected String name ="John";
	private int age = 44;
	public String state = "Utah";

	void l1(){
		System.out.println("this is l1-method");
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}
}