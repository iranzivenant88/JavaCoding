class ParentExThree{
	public int m4(){
		return 6;
	}
}

class ChildExThree extends ParentExThree{
	public double m4(){
		return 56.3;
	}
}

public class MainThree{
	public static void main(String...args){
	System.out.println("Start of main Method");
	ChildExThree ce = new ChildExThree();
	ce.m4();
	System.out.println("End of Main method");
	}
}