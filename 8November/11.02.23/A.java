import java.util.*;
public class A{
	public static void main(String...args){
	
	Map<Integer,String> map = new HashMap<>();
		map.put(35,"vanant");
		map.put(29,"Bona");

		map.forEach((i,j)->System.out.println(i +"----"+j));


	}
}