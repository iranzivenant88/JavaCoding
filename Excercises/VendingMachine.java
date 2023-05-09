import java.util.HashMap;
import java.util.Map;

public class VendingMachine{
	public static void main(String[]args){
	Soda soda1 = new Soda("Coca",250);
	Soda soda2 = new Soda ("Orage", 300);
	System.out.println(soda1.name+" - "+soda1.price);
	System.out.println(soda2.name+ "-"+soda2.price);

	}

	Map<Soda,Integer>map ;

	VendingMachine(Map<Soda,Integer>map){
	 	this.map = new HashMap<>();

	}

	
}

class Soda {
	String name;
	int price;

	Soda (String name ,int price){
	this.name = name;
	this.price = price;
	}

}
