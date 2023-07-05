package d;
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
		int a = 36;
		System.out.println("The value of a is : "+a);
		System.out.println("End of h3-method");
	}
	public static void main(String...args){
		System.out.println("Start of the main method ");
		ParentExTwo pa = new ParentExTwo();
		pa.h3();
		ChildExTwo ca = new ChildExTwo();
		ca.e1(33,24);
		ca.h3();
		pa.h2();
		System.out.println("End of  the main method");

	}
}