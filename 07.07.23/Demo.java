public class Demo{
	
	public Demo(){
		this(10);
		System.out.println("No-parameter");
	}
	public Demo(int i){
		this(10.5);
		System.out.println("int-parameter ");
	}
	public Demo(double d){
		
		System.out.println("double-parameter");
	}

	public static void main(String[]args){
		System.out.println("Start of main method");
		Demo d1 = new Demo();
		Demo d2 = new Demo(10);
		Demo d3 = new Demo(11.9);
		Demo d4 = new Demo(3L);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println("End of main method");

	}
}