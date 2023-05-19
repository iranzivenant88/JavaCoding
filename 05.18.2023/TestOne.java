public class TestOne{
	public static void main(String[]args){
	System.out.println("Start of Main method");
	h1();
	h2();
	System.out.println("End of main method");
	}
	static int a = 10;
	static{
	System.out.println("First static Block");
	h1();
	}
	public static void h1(){
	System.out.println(a);
	System.out.println(b);
	}
	public static void h2(){
	System.out.println("Hello");
	System.out.println(b);
	}
	static{
	System.out.println("Second static Block");
	}
	static int b = 34;
	static int c = 45;
}