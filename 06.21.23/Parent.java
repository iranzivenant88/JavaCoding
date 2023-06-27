/* different package sub class */

package com.grace;
public class Parent{
	int age ;
	private int points ;
	protected String name ;
	public String country ;

public Parent(int age,String name,String country){
		this.age = age;
		this.name = name;
		this.country = country;
	System.out.println("The Parent age is : " +age+ " , The Parent name is : "+name+" , The parent country is : "+country);
	}

	public void setPoints(int points){
		this.points = points;
	}

	public int getPoints(){
		return points;
	}

	
}
