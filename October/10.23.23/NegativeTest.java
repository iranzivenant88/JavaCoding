package org.venant.exceptionhandlingexampletwo;
import com.venu.throwexample.NegativeNumberFound;
import java.util.Scanner;

public class NegativeTest {
    public static void main(String[] args) {
        System.out.println("Start of Main Method");
        Scanner sc = null;
        int positiveNumber = 0;
        
        try {
            System.out.println("Start of try block");
            sc = new Scanner(System.in);
            System.out.println("Please Enter a positive number");
            positiveNumber = sc.nextInt();
            
            if (positiveNumber < 0) {
                throw new NegativeNumberFound();
            } else {
                System.out.println("Your Entered Number is: " + positiveNumber);
            }
            System.out.println("End of try block");
        } catch (NegativeNumberFound ex) {
            ex.printStackTrace();
        }
        
        System.out.println("End of Main Method");
    }
}
