package com.venant.filehandling.test;
import com.venant.filehandleexampleone.Employee;
import com.venant.filehandling.example.Address;
import com.venant.department.Department;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class TestEmployee {
    public static void main(String...args) {
        System.out.println("Start of Main Method");
        Employee employee = null;
        Department department = null;
        Address address = null;
       
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            System.out.println("Start of try block");
            employee = new Employee();
            employee.employeeId = Integer.parseInt(args[0]);
            employee.employeeName = args[1];
            employee.employeeAge = Integer.parseInt(args[2]);
            employee.employeeIncome = Double.valueOf(args[3]);
            
            address = new Address();
            address.address = args[4];

            department = new Department();
            department.departmentId =args[5];
            department.departmentName = args[6];  
            
        double grossSalary = employee.calculateGrossSalary();
        double k401 = employee.calculate401K();

            printWriter = new PrintWriter("employeeDetails.txt");
            printWriter.println("Employee ID: " + employee.employeeId);
            printWriter.println("Employee Name: " + employee.employeeName);
            printWriter.println("Employee Age: " + employee.employeeAge);
            printWriter.println("Employee Income: " + employee.employeeIncome);
            printWriter.println("Employee Address: " + address.address);
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
        try{
            System.out.println("start of reading the file");

            fileReader = new FileReader("employeeDetails.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();    
            }

        }//end of try block
        catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        finally{
            try{
                System.out.println("start of finally block");
                    if(bufferedReader != null){
                bufferedReader.close();
            }
            
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("End of finally block");
        }
        System.out.println("end of main method");
       
    }//close of main

}//close of class
