package org.venant.filehandling.exampleone;

import java.io.PrintWriter;
import java.io.IOException;

public class FileHandlingExOne {
    public static void main(String... args) {
        System.out.println("Start of Main Method");
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String address = null;
        PrintWriter printWriter = null;

        try{
        System.out.println("Start of try block");
        System.out.print("Please Enter Your First Name : ");
        firstName = args[0];
        System.out.print("Please Enter Your Middle Name: ");
        middleName = args[1];
        System.out.print("Please Enter Your Last Name: ");
        lastName = args[2];
        System.out.print("Please Enter Your Address: ");
        address = args[3];

        System.out.println("Thanks for your details, we will store it in our records.");

            printWriter = new PrintWriter("DemoOne.txt");
            printWriter.println(args[0]);
            printWriter.println(args[1]);
            printWriter.println(args[2]);
            printWriter.println(args[3]);
            System.out.println("Your records are stored in our records , have a nice day!");
            System.out.println("End of try block");
        
        } //end of try block
        catch (IOException ex) {
            ex.printStackTrace();
        } //close of catch block
        catch (Exception ex) {
            ex.printStackTrace();
        } //close of catch block
        finally {
            try {
                if (printWriter != null)
                    printWriter.close();
            } // try of try block
            catch (Exception ex) {
                ex.printStackTrace();
            }//close of catch block
        }//close of finally block 

        System.out.println("close of main method");
       
    }//close of main method
}//close of class 
