class ParentExFour{
	public Number m5(){
		return 56;
	}
}
class ChildEXFour extends ParentExFour{
	public int m5(){
		return 21;
	}
}
public class MainFour{
	public static void main(String[]args){
	 ChildExFour ce = new ChildExFour();
	 int result = ce.m5();
	 System.out.println("Your result is :" +result);
	 System.out.println("End of Main method");
	}
}