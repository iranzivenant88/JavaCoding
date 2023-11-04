package com.venant.filehandleexampleone;
import 	com.venant.department.Department;
import  com.venant.filehandling.example.Address;

public class Employee{
	public int employeeId;
	public String employeeName;
	public int employeeAge;
	public double employeeIncome;
	Department department;
	Address address ; 

	  // Calculate the gross salary 
    public double calculateGrossSalary() {
        double bonus = 1000; 
        return employeeIncome + bonus;
    }

    // Calculate the 401K 
    public double calculate401K() {
        double percentage = 0.05; // 5% of the gross salary.
        return calculateGrossSalary() * percentage;
    }
}