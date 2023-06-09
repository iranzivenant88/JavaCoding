public class VarArgExFour{
	public static void m1(int...x){
		System.out.println("var-arg method");
	}
	public static void m1(int x){
		System.out.println("Normal Method");
	}
	public static void main(String[]args){
		m1();
		m1(20,30);
		m1(100);
	}
}