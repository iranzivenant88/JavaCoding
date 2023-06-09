public class VarArgExThree{
	public static void m3(int...x){
		System.out.println("int...x");
	}
	public static void m3(int[]x){
		System.out.println("int[] x");
	}
	public static void main(String[]args){
	VarArgExThree va = new VarArgExThree();
	va.m3(10,20);
	va.m3(34);
	System.out.println("End of main method");
	} 
}