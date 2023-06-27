/*different packages non sub class */

package com.julius;
public class Lawyer{
	int legNumber ;
	protected String name ;
	private int age ;
	public String state;

	public Lawyer(int legNumber,String name,String state){
		this.legNumber = legNumber;
		this.name = name;
		this.state = state;

		System.out.println("The lawyer id number id : "+legNumber+ " ,The lawyer Name is : "+name+" , The lawyer age is : "+age+" , The state is : "+state);
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
	
}