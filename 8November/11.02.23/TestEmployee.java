package com.venant.filehandling.test;
import com.venant.filehandleexampleone.Employee;
import com.venant.filehandling.example.Address;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TestEmployee {
    public static void main(String... args) {
        System.out.println("Start of Main Method");
        Employee employee = null;
        Department department = null;
        Address address = null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        int employeeId = 0;
        String employeeName = null;
        int employeeAge = 0;
        double employeeIncome = 0.0;
        String address = null;
        String departmentId = null ;
        String departmentName = null;

        try {

            System.out.println("Start of try block");
            employee = new Employee();
            employee.employeeId = Integer.parseInt(args[0]);
            employee.employeeName = args[1];
            employee.employeeAge = Integer.parseInt(args[2]);
            employee.income = Double.parseDouble(args[3]);
            employee.address = args[4];
            employee.department = args[5];

            address.address = args[6]; 
            department.departmentId =args[7];
            department.departmentName = args[8];  
            

        double grossSalary = employee.calculateGrossSalary();
        double k401 = employee.calculate401K();

            printWriter = new PrintWriter("employeeDetails.txt");
            printWriter.println("Employee ID: " + employee.employeeId);
            printWriter.println("Employee Name: " + employee.employeeName);
            printWriter.println("Employee Age: " + employee.employeeAge);
            printWriter.println("Employee Income: " + employee.employeeIncome);
            printWriter.println("Employee Address: " + employee.address);
            printWriter.println("Employee DepartmentId: " + department.departmentId);
            printWriter.println("Employee DepartmentName: " + department.departmentName);
            printWriter.println("Gross Salary: " + grossSalary);
            printWriter.println("401K: " + k401);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (printWriter != null)
                    printWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
       
    }
}
