//public access modifer , same package non-sub class 

package com.venant;
class Student{
	public int idNumber = 2;

	public static void s2(){
		System.out.println("This is s1-method");
	}
}
public class StudentMain{
	public static void main(String[]args){
		Student st1 = new Student();
		System.out.println("The student number is : "+st1.idNumber);
		Student.s1();
	}
} 