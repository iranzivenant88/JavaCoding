/*different packages non sub class */

package com.julius;
public class Lawyer{
	int legNumber ;
	protected String name ;
	private int age ;
	public String state;

	public Lawyer(int legNumber,String name,int age,String state){
		this.legNumber = legNumber;
		this.name = name;
		this.age = age;
		this.state = state;

		System.out.println("The lawyer id number id : "+legNumber+ " ,The lawyer Name is : "+name+" , The lawyer age is : "+age+" , The state is : "+state);
	}

	 public void showDisplayLegNumber(int legNumber){
	 	System.out.println("The leg number is : "+legNumber);
	 }

	 public void displayName(String name){
	 	System.out.println("The lawyer's name is : "+name);
	 }

	 public void getAge(int age){
	 	System.out.println("My age is : "+age);
	 }

	 public void showState(String state){
	 	System.out.println("The state is  : "+state);
	 }
	// 	this.age = age;
	// }

	// public int getAge(){
	// 	return age;
	// }

	// public void setName(String name){
	// 	this.name = name;
	// }
	// public String getName(){
	// 	return name;
	// }
	// public void setLegNumber(int legNumber){
	// 	this.legNumber = legNumber;
	// }
	// public int getLegNumber(){
	// 	return legNumber;
	// }
	// public void setState(String state){
	// 	this.state = state;
	// }
	// public String getState(){
	// 	return state;
	// }
}