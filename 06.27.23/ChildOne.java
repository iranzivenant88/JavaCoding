class ParentOne{
	public void m1(){
		System.out.println("ParentOne-m1-method");
	}

	public int m2(int a , int b){
		System.out.println("Start of m2-method");
		int result = a+b;
		return result;
	}
}

class ChildOne extends ParentOne{
	public void m1(){
		System.out.println("Start of m3-method");
		System.out.println("End of m3-method");
	}

	 void m3(){
		System.out.println("Start of m3-method");
		System.out.println("End of m3-method");
	}

	public int m2(int a , int b){
		System.out.println("Start of m2-method");
		int output = a +b;
		return output;
	}

	public static void main(String...args){
		System.out.println("Start of Main method");
		ParentOne p1 = new ParentOne();
		p1.m1();

		int finalResult = p1.m2(10,20);
		ChildOne c1 = new ChildOne();
		c1.m3();
		c1.m1();

		int finalOutput = c1.m2(90,20);
		System.out.println(finalResult);
		System.out.println(finalOutput);
		System.out.println("End of Main Method");
	}
}