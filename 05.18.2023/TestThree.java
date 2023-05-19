public class TestThree{
	static double d = 45.6;
	String lastName = "Gosling";
	{
	System.out.println("First instance block");
	}
	static {
	System.out.println("First static block");
	System.out.println(d);
	}
	public void m1(){
	System.out.println(d);
	System.out.println(lastName);
	}
	public void m2(){
	System.out.println(lastName);
	System.out.println("End of m2-method");
	}
	{
	System.out.println("Second instance block");
	System.out.println(lastName);
	}
	static{
	System.out.println("Start of second static block");
	System.out.println(d);
	System.out.println("End of second static block");
	}
	boolean b = true;
	static char c ='g';
	public static void main(String[]args){
	TestThree tt = new TestThree();
	System.out.println(c);
	System.out.println(d);
	}
}