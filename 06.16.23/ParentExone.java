package gh.adam.bob;
class ParentExOne{
	double salary;
	double calculateSalary(){
		double finalSalary = (salary+100)*12;
			return finalSalary;
	}
	void setSalary(double salary){
		this.salary = salary;
	}
	void j1(double t , String s){
		System.out.println("double and String parameter");
	}
	void j1(float f , int y){
		System.out.println("float and int parameters");
	}
	static int b = 23;
}
class ChildExOne{
	String name = "James Gosling";
}
class MainExOne{
	public static void main(String...args){
		System.out.println("Start of Main Method");
		ParentExOne pe = new ParentExOne();
		pe.j1(34.2f,34);
		pe.j1(67.3,"vennat");
		pe.setSalary(9000.00);
		double yourSalary = pe.calculateSalary();
		ChildExOne ce = new ChildExOne();
		System.out.println("The Child Name is : "+ce.name);
		System.out.println("The Parent value is : "+pe.b);
		System.out.println("End of main method");
	}
}
class MainExTwo{
	public static void main(String...args){
		System.out.println("Start Main Method");
		ChildExOne ce = new ChildExOne();
		ParentExOne pe = new ParentExOne();
		System.out.println("The child Name is : "+ce.name);
		System.out.println("Print the parent vaule :"+pe.b);
		//System.out.println("Child printing parent value: "+ce.b);
		//ce.j1(34.5,"Mark");
		System.out.println("End of Main Method");

	}
}



