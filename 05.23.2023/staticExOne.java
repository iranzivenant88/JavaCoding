class staticExOne{
	static int u = 45;
	public static void m1(){
	System.out.println("Start of m1-static method");
	System.out.println(u);
	System.out.println("End of m1-static method");
	}
	static {
	System.out.println(u);
	System.out.println(u);
	System.out.println("End of first static Block");
	}
	static{
	System.out.println("Start of Second Static Block");
	m1();
	System.out.println("End of Second static Block");
	}
	public static void  m2(){
	System.out.println(u);
	m1();
	System.out.println("End if static m2-method");
	}
	public static void m3(){
	m2();
	System.out.println(u);
	System.out.println("End of Static-3 method");
	}
	static int y = 45;
	static int z = 56;
	public static void main(String[]args){
	System.out.println(y+"..."+z);
	m1();m2();m3();
	}
}