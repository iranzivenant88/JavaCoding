public class Animal{
	int age;
	String name;

public Animal(int age, String name){
	this();
	this.age = age;
	this.name = name;
} 
public Animal(){
	System.out.println("animal constructor");
}

public  void eat(){
	System.out.println("Eat method for animal");

}
	
}
