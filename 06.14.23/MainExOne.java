package com.rian.example;
class ParentExOne{
	void m1(int i , float j){
	System.out.println("int-float parameter");
	}
	void m1(float i , int j){
		System.out.println("float-int parameter");
	}
	double income = 8900.00;
}

class ChildExOne extends ParentExOne{
	float age = 45.0f;
}

public class MainExOne{
	ChildExOne ce = new ChildExOne();
	ce.m1(10,34.5f);
	ce.m1(23.4f,23);
	System.out.println(ce.income);
	System.out.println(ce.age);
	System.out.println("End of Main Method");
}