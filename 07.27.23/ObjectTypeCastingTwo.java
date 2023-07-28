package com.venant.otc.example;
public class ObjectTypeCastingTwo{
	public static void main(String...args){
	System.out.println("Start of main method");
	Object o = new String("Harris");
	Object o1 = (String)o;
	System.out.println(o);
	System.out.println(o1);
	System.out.println("End of main method");
	}
}