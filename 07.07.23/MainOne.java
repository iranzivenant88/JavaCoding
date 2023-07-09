public class MainOne{
	public static void main(String...args){
		System.out.println("Start of main method");

		ParentExOne p1 = new ParentExOne();
		ChildExOne c1 = new ChildExOne();
		c1.m1();
		System.out.println("End of Main");
	}
}