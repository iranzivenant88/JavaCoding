package org.venu.venant.instanceof.exampletwo;
public class InstanceOfOperatorExTwo{
	public static void main(String[]args){
		System.out.println("Start of Main Method");
		StringBuffer sb1 = StringBuffer("Bob");
		StringBuilder sb2 = StringBuilder("Eric");
		String sb3 = "Adam";
		String sb4 = new String("Chris");

		System.out.println(sb1 instanceof StringBuffer);
		System.out.println(sb1 instanceof Object);
		System.out.println(sb2 instanceof String);
		System.out.println(sb3 instanceof StringBuilder);
		System.out.println(sb4 instanceof Object);
		System.out.println("End of Main Method");

	}
}