public class VarArgMethodExOne{
	public void m1(int...x){
		System.out.println("The length of the parameter is : "+x.length);
	}
	public static void main(String[]args){
	VarArgMethodExOne ve = new VarArgMethodExOne();
	System.out.println("Start of Main method");
	ve.m1();
	ve.m1(10);
	ve.m1(10,20);
	ve.m1(10,20,30);
	ve.m1(10,20,30,40,50);
	System.out.println("End of Main method");
	}
}