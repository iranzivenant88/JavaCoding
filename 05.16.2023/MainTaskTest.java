class TaskTestOne{
	public void m1(){
	System.out.println("m1-non static method");
	m2();
	System.out.println("End of m1-non static method");
	}
	public void m2(){
	System.out.println("m2-non-static method");
	m3();
	}
	public void m3(){
	m4();
	m5();
	}
	public void m4(){
	System.out.println("m4-method");
	}
	public void m5(){
	System.out.println("Start of m5-static method");
	System.out.println("End of m5-static method");
	}
}

public class MainTaskTest{
	public static void main(String[]args){
	System.out.println("Start of Main method");
	TaskTestOne t1 = new TaskTestOne();
	t1.m1();
	System.out.println("End of Main method");
	}
}