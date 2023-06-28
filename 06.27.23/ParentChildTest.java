	
	public class ParentChildTest{
		public static void main(String[]args){
			System.out.println("Start of Main Method");
			ParentExTwo p2 = new ParentExTwo();
			double parentResult = p2.multiply(34.5,12.5);
			p2.setAge(34);
			int parentAge = p2.getAge();
			System.out.println("Parent Age is :"+parentAge);

			ChildExTwo c2 = new ChildExTwo();
			c2.setAge(30);
			int childAge = c2.getAge();
			System.out.println("The child age is :"+childAge);
			c2.multiply(89.1,23.4);
			System.out.println("End of Main method");
	}
}