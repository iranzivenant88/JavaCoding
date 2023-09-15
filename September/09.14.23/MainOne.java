package com.main;
import org.test.employeeone.Employee;
public class MainOne{
	public static void main(String[]args){
		System.out.println("Start of the main method");
		Employee[]emp = new Employee[3];
		emp[0] = new Employee(101,"James",9000.00);
		emp[1] = new Employee(102,"Harris",8500.00);
		emp[2] = new Employee(103,"Kayle",8700.00);
		for(Employee employees : emp){
			System.out.println("Employee Id : "+employees.employeeId+" Employee Name is :"+employees.employeeName+" Employee income :"+employees.income);
		}
		System.out.println("End of main method");

	}
}