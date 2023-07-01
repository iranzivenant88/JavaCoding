package zak.jack.latham;
public class ParentExOne{
	public double m1(double a1, double a2){
		System.out.println("Start of m1-method");
		System.out.println("The value of a1 is :"+a1);
		System.out.println("The value of a2 is :"+a2);
		double result = a1+a2;
		return result;
	}
	protected void m2(){
		System.out.println("Start of m2-method");
		m3();
		System.out.println("End of m2-method");
	}
	public void m3(){
		int a = 19;
		int b = 1;
		int result = a+b;
		System.out.println("The result is :"+result);
	}
}