class StaticExTwo{
	static String name = "James";
	static{
	System.out.println(name);
	m3();
	System.out.println("End of First-Static Block");
	}
	public static void m3(){
	System.out.println("Start of static-m3 method");
	m2();
	System.out.println("End of static m3-method");
	}
	public static void m2(){
	System.out.println(name);
	}
	static{
	System.out.println("Start of Second Static Block");
	m2();
	m2();
	}
	public static void m1(){
	System.out.println(name);
	System.out.println(name);
	}
	static int i = 100;
	static boolean b = false;
	public static void main(String[]args){
	System.out.println("Start of the main method");
	System.out.println(i);
	System.out.println(b);
	m1();
	m1();
	System.out.println("End of main method");
	}
}