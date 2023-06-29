public class MainOne{
	public static void main(String...args){
		System.out.println("Start of Main method");
		ParentExOne p1 = new ParentExOne();
		ChildExOne c1 = new ChildExOne();
		p1.m1();
		c1.m1();
		c1.m4();
		p1.setName("Bala");
		String userName = p1.getName();
		System.out.println("The user name is : "+userName);
		System.out.println("End of Main method");
	}
}