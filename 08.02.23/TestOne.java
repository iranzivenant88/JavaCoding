package test.com.staticfinal;
public class TestOne{
	byte variableOne;
	short variableTwo;
	static int variableThree;
	final static double VARIABLE_FOUR = 45;
	static boolean variableFive;

	public void m1(){
		System.out.println("Start of non static m1-method");
		final int variableThree = 89;
		boolean variableFive = true;
		System.out.println("Variable Three is : "+variableThree);
		System.out.println("Variable Five is : "+variableFive);
		System.out.println("VariableOne is : "+variableOne);
		System.out.println("VariableTwo is : "+variableTwo);
		System.out.println("VariableFour is : "+VARIABLE_FOUR);
		m5();
		System.out.println("End of non-static-m1-method");

	}
	public void m5(){
		System.out.println("Start of non-static m5 method");
		System.out.println("VariableOne is : "+variableOne);
		System.out.println("Variable Two is : "+variableTwo);
		System.out.println("Variable Three is : "+variableThree);
		System.out.println("Variable Four is : "+VARIABLE_FOUR);
		System.out.println("Variable Five is : "+variableFive);
		System.out.println("End of non-static m5 method");

	}
	public void m3(int i){
		System.out.println("Start of non-static m3 method");
		char valueOne = 'k';
		float valueTwo = 90.8F;
		System.out.println("Value One is :"+valueOne);
		System.out.println("Value Two is :"+valueTwo);
		System.out.println("VariableOne is :"+variableOne);
		System.out.println("VariableTwo is :"+variableTwo);
		m1();
		System.out.println("End of non-static m3 method");
	}
	public void m4(){
		System.out.println("Start of non-static m4 method");
		m5();
		m3('c');
		System.out.println("End of non static m4 method");

	}
	public static void main(String...args){
		System.out.println("Start of main method");
		TestOne t6 =new TestOne();
		t6.m1();
		t6.m4();
		final int i;
		System.out.println("Variable One is :"+t6.variableOne);
		System.out.println("End of main method");
	}
}