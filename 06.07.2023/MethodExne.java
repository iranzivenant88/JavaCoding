public class MethodExOne{
	public void m1(){
	System.out.println("No-arg method");
	}
	public void m1(int i){
	System.out.println("One-arg method");
	}
	public void m1(int a , int b){
	System.out.println("Two-arg method");
	}
	public void m1(int a, int b , int c){
	System.out.println("Three-arg method");
	}
	public static void main(String[]args){
	MethodExOne me1 = new MethodExOne();
	me1.m1();
	me1.m1(10);
	me1.m1(20,30);
	me1.m1(100,200,300);
	}
}
