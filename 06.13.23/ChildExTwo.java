package com.gloria.eric;
class ParentExTwo{
	double m3(){
		return 34.2;
	}
	float m3(float i){
		return i;
	}
}

class ChildExTwo extends ParentExTwo{
	public static void main(String...venant){
		ChildExTwo ct = new ChildExTwo();
			double doubleResult = ct.m3();
			float floatResult = ct.m3(90.3f);
			System.out.println("The Double Result is :"+doubleResult);
			System.out.println("The Float Result: "+floatResult);
		
	}
}