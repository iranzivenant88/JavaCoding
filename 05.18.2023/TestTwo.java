public class TestTwo{
	static {
	System.out.println("Start of First static Block");
	e1();
	System.out.println("End of first Static Block");
	}
	public static void main(String[]args){
	System.out.println("Start of main method");
	TestTwo tt = new TestTwo();
	e1();
	e2();
	e3();
	System.out.println("End of main method");
	}
	static int h = 78;
	static String name = "James";

	public static void e1(){
	System.out.println(name);
	System.out.println(h);
	System.out.println("End of e1-method");
	}
	static{
	System.out.println("Start of Second Static Block");
	System.out.println(name);
	}
	public static void e2(){
	System.out.println("Start of e2-start method");
	System.out.println(h+name);
	}
	public static void e3(){
	System.out.println(name);
	}
}