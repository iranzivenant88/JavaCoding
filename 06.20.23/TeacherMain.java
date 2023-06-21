package com.wyatt;
import com.venant.TeacherOne;

public class TeacherMain extends TeacherOne{
	public static void main(String...args){
		System.out.println("start of main method");
		TeacherOne t1 = new TeacherOne();
		t1.setAge(23);
		int teacherAge = t1.getAge();
		System.out.println("The teacher age is:"+teacherAge);
		System.out.println("end of main method");
	}



	
}

