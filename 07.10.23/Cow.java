public class Cow extends Animal{
	int age;
	String name;

public Cow (int age,String name){
	super(age,name);
	this.age =age;
	this.name=name;
	System.out.println("Cow constructor");

	}
	public void eat(){
		System.out.println("Cow eats grasses");
	}

}