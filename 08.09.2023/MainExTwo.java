class ParentOne{
	public Object m1(){
	return null;
	}
}
class ChildOne extends ParentOne{
	public String m1(){
	return "Hello, this return message is from child One class";
	}
}

public class MainExTwo{
	public static void main(String... args){
	ChildOne co = new ChildOne();
	String message = co.m1();
	System.out.println(message);
	System.out.println("End of main method");
	}
}