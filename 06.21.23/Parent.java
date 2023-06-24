/* different package sub class */

package com.grace;
public class Parent{
	int age ;
	private int points ;
	protected String name ;
	public String country ;

	public void displayAge(int age){
		System.out.println("My age is : "+age);
	}
	
	public void displayName(String name){
		System.out.println("My Father's name is : "+name);
	}

	public void showCountry(String country){
		System.out.println("My country is :"+country);
	}

	public void getPoints(int points){
		System.out.println("My points are : "+points);

	}
}

	// public void setPoints(int points){
	// 	this.points = points;
	// }

	// public int getPoints(){
	// 	return points;
	// }

	// public void  setAge(int age) {
    //     this.age = age;
    // }

	// public int getAge() {
    //     return age;
    // }
    // public void  setName(String name) {
    //     this.name = name;
    // }

	// public String getName() {
    //     return name;
    //}
    // public void  setOrigin(String country) {
    //     this.country = country;
    // }
