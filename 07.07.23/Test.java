public class Test{
	public Test(){
		this(10);
		System.out.println("End of Test() Constructor");
	}

	public Test(int i){
		this();
		System.out.println("End of Test(int i) Constructor");
	}
	public static void m3(int i,int j){
		System.out.println("Start of static m3-method");
		System.out.println("End of static m3-method");
	}

	public static void main(String...args){
		System.out.println("Start of Main method");
		Test t1 = new Test();
		t1.m3(10,20);
		System.out.println("End of main method");
	}

}