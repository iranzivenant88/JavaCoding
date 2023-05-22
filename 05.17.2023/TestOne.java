class  TestOne{
	public void m1(){
	System.out.println("Start of m1-non-static method");
	m2();
	System.out.println("End of m1-non-static-method");
	}
	public void m2(){
	System.out.println("Start of m2-method");
	System.out.println("End of m2-method");
	m3();
	System.out.println("Hello");
	}
	public static void printHi(){
	System.out.println("Hi");
	}
	public void m3(){
	System.out.println(10);
	System.out.println(100+12);
	m4();
	m5();
	System.out.println("End of m3-method");
	}
	public void m4(){
	System.out.println("Start of m4-method");
	}
	public void m5(){
	System.out.println("Start of m5-method");
	System.out.println("End of m5 method ");

	}
	public static void main(String[]args){
	TestOne t1 = new TestOne();
	t1.m1();
	printHi();
	t1.m4();
	System.out.println("End of main method");
	}
}