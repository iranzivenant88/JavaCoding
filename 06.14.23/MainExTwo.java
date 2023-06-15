package org.gags.example;
class ParentExTwo{
	String getUserName(String userName){
	return userName;
	}
	double getUserIncome(double userIncome){
	return userIncome;
	}
	void m1(int i){
	System.out.println("m1-int-parameter");
	}
	float m1(){
	return 67.4f;
	}

}
class ChildExTwo{
	String ChildName = "Mark";
}
public class MainExTwo{
	public static void main(String[]args){
	System.out.println("Starting of main method");
	ParentExTwo pe = new ParentExTwo();
	String userName = pe.getUserName("venant");
	double userIncome = pe.getUserIncome(9000.00);
	ChildExTwo ce = new ChildExTwo();
	ce.m1(100);
	float floatValue = ce.m1();
	System.out.println("End of main method");
	}
}