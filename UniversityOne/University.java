package com.university;
public class University{
	public String universityName;
	public int numberOfStudents;
	public double universityFee;

	public University(String universityName,int numberOfStudents,double universityFee){
	this.universityName = universityName;
	this.numberOfStudents = numberOfStudents;
	this.universityFee = universityFee;

	System.out.println("University Name :" +universityName+ ",Number of Students are : "+numberOfStudents+",University Fee is : "+universityFee);
	}
	public void submitTasks(){
	System.out.println("Submit task");
	}
	public static void submitFee(){
	System.out.println("Submit Fee");
	}
}