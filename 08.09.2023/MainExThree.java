class ParentExTwo{
	public Object m2(){
	return null;
	}
}
class ChildExTwo extends ParentExTwo{
	public StringBuffer m2(){
	return null;
	}
}

public class MainExThree{
	public static void main(String[]args){
	ChildExTwo et = new ChildExTwo();
	et.m2();
	System.out.println("End of Method method");
	}
}