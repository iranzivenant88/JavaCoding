package com.parent.exampleone;

public class ParentExOne{
	public ParentExOne(){
		System.out.println("ParantExOne no parameter constructor");
	}
	public ParentExOne(int i){
		this(45.5);//this call
		System.out.println("int parameter constructor");
	}
	public ParentExOne(double d){
		this();
		System.out.println("double parameter constructor");
	}
	public void m1(){
		System.out.println("Start of non-static m1 method");
		System.out.println("End of non-static m1 method");

	}
	public void m1(int i){
		System.out.println("Start of non-staric m1 int parameter method");
		final int inputOne;
		System.out.println("End of non-static  m1 int parameter method");
	}
	
}