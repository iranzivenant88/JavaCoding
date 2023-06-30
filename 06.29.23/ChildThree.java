package lora.brain.adam;
import venu.yuta.sam.ParentThree;
public class ChildThree extends ParentThree{
	public void m2(){
		System.out.println("m2-method");
	}
	public  void m3(){
		System.out.println("m3-method");
	}

	public void m4(){
		System.out.println("Start of m4-method");
		m1();
		System.out.println("End of m4-method");
	}
}
