package com.child.exampleone;
import com.parent.exampleone.ParentExOne;
public class ChildExOne extends ParentExOne{
	String name;
	int age;
	public ChildExOne(){
		System.out.println("ChildExOne constructor");
	}
	public ChildExOne(String name, int age){
		System.out.println("Child Ex one Constructor");
		this.name = name;
		this.age = age;
	}
	public String m2(){
		return null;
	}
	public String toString(){
		return "Your Name is :"+name+"and age is "+age;
	}
}