public class MainTwo{
	public static void main(String...args){
		System.out.println("start of main method");
		ChildExTwo c2 = new ChildExTwo();
		ParentExTwo p2 = new ParentExTwo();
		c2.setIncome(9000.00);
		double childIncome = c2.getIncome();
		System.out.println("ChildIncome is :"+childIncome);
		p2.setName("Kyle");
		String parentName = p2.getName();
		System.out.println("Parne Name is "+parentName);
		double childNumber = c2.getNumber(56.5);
		int parentNumber = p2.getNumber(60);
		System.out.println("child number is :"+childNumber);
		System.out.println("ParentNumber is : "+parentNumber);
		System.out.println("End of main method");
	}
}