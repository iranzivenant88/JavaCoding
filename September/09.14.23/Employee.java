package org.test.employeeone;
public class Employee{
		public int employeeId;
		public String employeeName;
		public double income;
	public Employee(int employeeId,String employeeName,double income){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.income =income;

	}
	public void doWork(int numberOfHours){
		System.out.println("Employees work for :"+numberOfHours);
	}
}
