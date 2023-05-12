class NonInstanceEx{
	int i = 10;
	{
	m1();
	System.out.println("First Instance Block");
	}
	NonInstanceEx(){
	System.out.println("Constructor");
	}
	public static void main(String[]args){
	System.out.println("main");
	}
	public void m1(){
	System.out.println(j);
	}
	{
	System.out.println("Second Instance Bblock");
	}
	int j = 20 ;
}