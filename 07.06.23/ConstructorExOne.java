public class ConstructorExOne{
	String name;
	int age;
	double Income;

	public ConstructorExOne(String name,int age){
		this();
		this.name = name;
		this.age = age;
		System.out.println("Constructor with two parameters");
		System.out.println("Your age is :"+age+" and Your Name is :"+name);
	}


	public ConstructorExOne(){
		System.out.println("Constructor with no-parameters");
	}

	public ConstructorExOne(String name ,int age, double Income){
	this();
	System.out.println("Constructor with 3 parameters");
	this.name = name;
	this.age = age;
	this.Income = Income;
	System.out.println("Name is :"+name+ " Age is :"+age+"Income is :"+Income);
	}
}