package testing.main;
import org.harris.Addition;
public class MainTest{
	public static void main(String[]args){
	Addition a1 = new Addition();
	int output = a1.addTwoNumbers(100,200);
	System.out.println("The End Result is : "+output);

	}
}