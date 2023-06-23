/*different packages non sub class */

package com.julius;
public class Lawyer{
	int legNumber ;
	protected String name ;
	private int age ;
	public String state;

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setLegNumber(int legNumber){
		this.legNumber = legNumber;
	}
	public int getLegNumber(){
		return legNumber;
	}
	public void setState(String state){
		this.state = state;
	}
	public String getState(){
		return state;
	}
}