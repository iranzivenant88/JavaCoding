public class VenantTest{
	int i = 10;
	public static void m1(){
	System.out.println("m1-method");
	}
	public void m2(){
	System.out.println("m2-Method");
	}
	public static void main(String[]args){
	System.out.println("Start of Main method");
	VenantTest vt = new VenantTest();
	m2();
	System.out.println("End of Main Method");
	}
}