class ParentExTwo{
	public Number m3(){
		return 11;
	}
}
class ChildExTwo{
	public Double m3(){
		return 9.6;
	}
}
public class MainTwo{
	public static void main(String[]args){
	System.out.println("Start of Main method");
	ChildExTwo ct = new ChildExTwo();
	ct.m3();
	System.out.println("End of main method");

	}
}
