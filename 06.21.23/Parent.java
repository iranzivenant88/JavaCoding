/* different package sub class */

package com.grace;
public class Parent{
	int age ;
	private int points ;
	protected String name ;
	public String country ;

	public void setPoints(int points){
		this.points = points;
	}

	public int getPoints(){
		return points;
	}

	public void  setAge(int age) {
        this.age = age;
    }

	public int getAge() {
        return age;
    }
    public void  setName(String name) {
        this.name = name;
    }

	public String getName() {
        return name;
    }
    public void  setOrigin(String country) {
        this.country = country;
    }

	public String getOrigin() {
        return country;
    }

}