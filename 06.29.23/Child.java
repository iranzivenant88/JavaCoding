package mark.steve.brother;
import kyle.david.com.Parent;
public class Child extends Parent{
	public void m1(){
		System.out.println("hello from child class");
	}
public static void main(String...venant){
	System.out.println("Start of Main Method");
	Parent p1 = new Parent();
	Child c1 = new Child();
	p1.m1();
	c1.m1();
	System.out.println("End of Main Method");
}

}
