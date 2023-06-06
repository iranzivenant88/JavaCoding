class MOThreeDemo{
	public void m1(String s){
	System.out.println("String version");
	}
	public void m1(StringBuffer sb){
	System.out.println("StringBuffer version");
	}
	public static void main(String[]args){
	MOThreeDemo mtd = new MOThreeDemo();
	mtd.m1("Venant");
	mtd.m1(new StringBuffer("Harris"));
	mtd.m1(null);
	}
}