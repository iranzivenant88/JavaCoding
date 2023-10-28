package org.venant.filehandling.examplefive;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class FileHandlingExFive {
    public static void main(String...args) {
        System.out.println("Start of Main Method");
        Scanner sc = null;
        PrintWriter printWriter = null;
        String employeeName = null;
        double employeeIncome = 0.0;
        int employeeAge = 0;
        
        try {
            System.out.println("Start of try block");
            sc = new Scanner(System.in);
            System.out.print("Please Enter your name: ");
            employeeName = sc.nextLine();
            System.out.print("Please Enter your income: ");
            employeeIncome = sc.nextDouble();
            System.out.print("Please Enter your age: ");
            employeeAge = sc.nextInt();
            printWriter = new PrintWriter("ExampleFive.txt");
            printWriter.println(employeeName);
            printWriter.println(employeeIncome);
            printWriter.println(employeeAge);
            System.out.println("End of try block");
        }//End of try block
         catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Start of Finally Block");
            try {
                if (sc != null)
                    sc.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            try {
                if (printWriter != null)
                    printWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("End of Finally Block");
        }//End of finally
        System.out.println("End of Main Method");
    }//End of main method
}//End of class
