class Base{
	static int i = 10;
	static{
	m1();
	System.out.println("Base static Block");
	}
	public static void main(String[]args){
	m1();
	System.out.println("Base main");
	}
	public static void m1(){
	System.out.println(j);
	}
	static int j = 20;
}//close of class Base

class Derived extends Base{
	static int x = 100;
	static {
	m2();
	System.out.println("Derived First static Block");
	}
	public static void main(String[]args){
	m2();
	System.out.println("Delived Main");
	}
	public static void m2(){
	System.out.println(y);
	}
	static {
	System.out.println("Devided Second Static Block");
	}
	static int y = 200;
}