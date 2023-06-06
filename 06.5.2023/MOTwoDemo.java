class MOTwoDemo{
	public void m1(String s){
	System.out.println("String version");
	}
	public void m1(Object o){
	System.out.println("Object version");
	}
	public static void main(String[]args){
	MOTwoDemo mtd = new MOTwoDemo();
	mtd.m1(new Object());
	mtd.m1("James");
	mtd.m1(null);
	}
}