public class MainTwo{
	public static void main(String[]args){
		System.out.println("Start of Main Method");

		ParentExOne p1 = new ParentExOne();
		ChildExOne  c1 = new ChildExOne("James",61);
		ChildExOne  c2 = new ChildExOne("Kyle");
		ChildExOne  c3 = new ChildExOne();

		System.out.println(p1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("End of Main method");
	}
}