package com.jack.childexampleone;
import com.harris.parentexampleone.ParentExOne;
public class ChildExOne extends ParentExOne{
	public boolean m4(){
		System.out.println("Start of m4() non-static methd of ChildExOne");
		System.out.println("End of m4() non-static method of ChildExOne");
		return true;
	}
	@Override
	public void m1(String s){
		System.out.println("Start of m1(String) non-static method  of ChildExOne");

	System.out.println("The Value of s is : "+s);
	System.out.println("End of m1(String) non static method of ChildExOne");
	}
	@Override
	public static void m2(int i){
	System.out.println("Start of m2(int) static method of ParentExOne");
	System.out.println("The value of i is :"+i);
	System.out.println("End of m2(int) static-method of ParentExOne");
	}
}