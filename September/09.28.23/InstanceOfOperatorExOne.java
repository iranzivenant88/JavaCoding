package org.venant.venu.exampleone;
public class InstanceOfOperatorExOne{
	public static void main(String[]args){
		System.out.println("Start of Main Method");
		String s1 = "James";
		String s2 = new String("Parent");
		System.out.println(s1 instanceof String);
		System.out.println(s2 instanceof Object);
		System.out.println(s2 instanceof String);
		System.out.println(s1 instanceof Object);
		//System.out.println(s1 instanceof Thread);
		//System.out.println(s2 instanceof Thread);
		System.out.println("End of Main Method");

	}
}