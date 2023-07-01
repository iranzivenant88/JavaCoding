package xavier.tom.bob;
public class ParentExTwo{
	public static void h1(){
		System.out.println("Start of h1-method");
		System.out.println("End of h1-method");
	}
	public void h2(){
	System.out.println("Start of h2-method");
	long a = 10 ; 
	long b = 20 ;
	long result = a+b;
	System.out.println("your result is :"+result);
	System.out.println("End of h2-method");
	}
	public static void h3(){
		System.out.println("Start of h3");
		int a = 34;
		System.out.println("The value of a is :"+a);
		System.out.println("End of h3-method");
	}
}