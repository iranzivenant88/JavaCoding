package org.object.otc.example;
public class ObjectTypeCasting{
	public static void main(String...args){

	System.out.println("Start of main method");
	Object o = new String("James");
	StringBuffer sb = (StringBuffer)o;
	System.out.println("End of main method");
	}
}