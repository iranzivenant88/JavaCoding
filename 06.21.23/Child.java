package com.tito;
import com.grace.Parent;

public class Child extends Parent {
    public Child(int age, String name, String country) {
        super(age, name, country);
    }

    public static void main(String...args) {
        Child c1 = new Child(21, "Bala", "India");

        c1.setPoints(20);
        int points = c1.getPoints();
        System.out.println("The points are :"+points);


        
    }
}
