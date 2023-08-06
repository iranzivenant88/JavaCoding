

public class Animal{
	String name;
	int age;
	int weight;
	public static void main(String...args){
		 Animal dog = new Animal();
		 System.out.println(dog);
	}
	public String toString(){
		return name+" "+age+" "+weight;
	}
}