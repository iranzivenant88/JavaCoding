class MOFourDemo{
	public void m1(int i,float f){
	System.out.println("int-float");
	}
	public void m1(float f, int i){
	Sytstem.out.println("fload-int version");
	}
	public static void main(String[]args){
	MOFourDemo mfd = new MOFourDemo();
	mfd.m1(10,10.5f);
	mfd.m1(10.5f,10);
	mfd.m1(10,10);
	mfd.m1(10.5f,10.5f);
	}
}