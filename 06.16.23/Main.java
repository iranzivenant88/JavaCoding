package us.com.venant;
class A{
	int a = 10;
	void m1(){
	System.out.println("m1-method");
	}
}
class Main{
	public static void main(String...args){
		A a1 = new A();
		System.out.println(a1.a);
		a1.m1();
	}
}