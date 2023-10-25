package com.venant.throwkeywordexampleone;
public class ThrowKeywordExOne {
    public static void main(String[] args) {
        int age = -4;  
       getAge(age);
  
    }
    public static void getAge(int age){
         if (age < 0) {
            throw new ArithmeticException("Age cannot be negative");
        }
         System.out.println("Age is: " + age);  
    }
}
