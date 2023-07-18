public class ReferenceVar{
	int age = 12;
	
	public ReferenceVar(int age){
		this.age = age;
		System.out.println("The age is :"+age);
	}
	public static void main(String...args){
		Person alex = new Person("Alex");
		Person Clement = alex;

		System.out.println("Before changing alex");
		System.out.println(alex.name +" | "+Clement.name);

		alex.name = "venant";
		System.out.println("after changing alex");
		System.out.println(alex.name +" | "+Clement.name);


	}
	
}
 class Person{
	String name;
	Person(String name){
		this.name = name;
	}

}