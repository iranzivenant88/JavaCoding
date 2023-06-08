public class VarArgMethodEx{
	public void m2(int...x){
	System.out.println("var-arg method");
	}
	public static void main(String[]args){
	VarArgMethodEx va = new VarArgMethodEx();
	va.m2();
	va.m2(10);
	va.m2(10,20);
	va.m2(10,20,30);
	va.m2(10,20,30,40);
	}
}