/*different package non sub class*/ 

package com.bona;
import com.julius.Lawyer;

public class LawyerMain {
    public static void main(String... args) {
        Lawyer l1 = new Lawyer(201, "Moses", "Idaho");
        
        // Set the age 
        l1.setAge(30);
        
        // Retrieve and print the age 
        System.out.println("The lawyer age is: " + l1.getAge());
        
        
    }
}

