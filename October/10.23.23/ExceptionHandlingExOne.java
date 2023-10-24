package com.venant.exceptionexampleone;
import java.util.Scanner;

public class ExceptionHandlingExOne {
    public static void main(String[] args) {
        System.out.println("Start of Main Method");
        Scanner sc = null;
        int employeeId = 0;
        String employeeName = null;
        double employeeIncome = 0.0;
        int employeeAge = 0;
        try {
            System.out.println("Start of try block");
            sc = new Scanner(System.in);
            System.out.print("Please enter your Employee Id : ");
            employeeId = sc.nextInt();
            sc.nextLine();
            System.out.print("Please enter your Employee Name: ");
            employeeName = sc.nextLine();
            System.out.print("Please enter your Income :");
            employeeIncome = sc.nextDouble();
            System.out.print("Please enter your age: ");
            employeeAge = sc.nextInt();
            System.out.println("End of try block");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (sc != null) 
                    sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("finally block");
        }
        System.out.println("Your Details are : ");
        System.out.println("Employee Id is : " + employeeId);
        System.out.println("Employee Name is : " + employeeName);
        System.out.println("Employee Income is : " + employeeIncome);
        System.out.println("Employee Age is : " + employeeAge);
    }
}
