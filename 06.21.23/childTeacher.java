package com.peter;

 class Teacher{
	int idNumber;
	private String name ;
	public String level ;
	protected int age ;
	public long zipCode ;

	public void setName(String name ){
		this.name = name;
	}

	public String getName(){
		return name;
	}


	void m1(){
		System.out.println("method m1");
	}
}

public class childTeacher extends Teacher{
	public static void main(String[]args){

		childTeacher t1 = new childTeacher();
		t1.setName("venant");
		String name = t1.getName();
			System.out.println("Teacher's name is:"+name);
			System.out.println("Teacher level is:"+t1.level);
			System.out.println("Teacher's age is:"+t1.age);
			System.out.println("Teacher zipCode  is:" +t1.zipCode);

			t1.m1();

	}
}