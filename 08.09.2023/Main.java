class SportsPerson{
	public void train(){
	System.out.println("Every Sportsperson trains");
	}
	public void eat(){
	System.out.println("depends on their diet");
	}
}

class Boxer extends SportsPerson{
	public void train(){
	System.out.println("Do training with punching bags");
	}
	public void eat(){
	System.out.println("Eat alot of chicken");
	}
}
public class Main{
	public static void main(String... args){
	Boxer boxer = new Boxer();
	boxer.train();
	System.out.println("End of main method");
	}
}