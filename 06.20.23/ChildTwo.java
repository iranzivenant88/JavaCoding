//public access modifer,same package sub class 

package com.venant;
 class ParentTwo{
	public int age = 20;
	public String name = "Bala";
 	public static void m2(){
 	System.out.println("This is the method m2");
 }
} 

public class ChildTwo extends ParentTwo{
	public static void main(String...args){
		ParentTwo p2 = new ParentTwo();
		ChildTwo c2 = new ChildTwo();
		System.out.println("The child age is "+c2.age);
		System.out.println("The child name is : "+c2.name);
		
		System.out.println("The age is :"+p2.age);
		System.out.println("The name is :"+p2.name);
		m2();

	}
}