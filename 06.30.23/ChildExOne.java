package nathan.gaga.kyle;
import zak.jack.latham.ParentExOne;
public class ChildExOne extends ParentExOne{
	public static void n1(){
		System.out.println("Start of n1-method");
		System.out.println("End of n1-method");
	}
	public void m2(){
		double a = 12.3f;
		double b = 'a';
		double result = a+b;
		System.out.println("The result is :"+result);
	}
	// public static void m3(){
	// 	System.out.println("Start of m3-method");
	// 	System.out.println("End of m3-method");
	// }
	public void m3(){
		System.out.println("Start of m3-method");
		System.out.println("End of m3-method");
	}
	public static void main(String...args){
		System.out.println("Start of main method");
		ParentExOne pe = new ParentExOne();
		double output = pe.m1(34.5,56.7);
		System.out.println(output);
		ChildExOne ce = new ChildExOne();
		ce.n1();
		ce.m2();
		ce.m3();
		System.out.println("End of main method");

	}
}
