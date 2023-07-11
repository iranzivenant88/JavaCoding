
public class Main{
	public static void main(String...args){
		System.out.println("Start of main method");

		Animal a1 = new Animal(12,"Bihogo");
		Cow c1 = new Cow(13,"Haguma");
		c1.eat();

		System.out.println("End of main method");
	}
}