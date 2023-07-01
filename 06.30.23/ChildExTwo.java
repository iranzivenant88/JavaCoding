package harris.chris.mark;
import xavier.tom.bob.ParentExTwo;
public class ChildExTwo extends ParentExTwo{
	public void e1(int i, int j){
		System.out.println("Start of e1-method");
		System.out.println("The value of i is :"+i);
		System.out.println("The value of j is :"+j);
		System.out.println("End of e1-method");
	}
	public static void h3(){
		System.out.println("Start of h3-method");
		int a = 34;
		System.out.println("The value of a is : "+a);
		System.out.println("End of h3-method");
	}
	public static void main(String...args){
		System.out.println("Start of main method");
		ParentExTwo po = new ParentExTwo();
		po.h3();
		ChildExTwo co = new ChildExTwo();
		co.e1(34,23);
		co.h3();
		po.h2();
		System.out.println("End of main method");

	}
}