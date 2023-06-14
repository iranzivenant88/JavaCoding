package sam.venant;
public class DefaultModifierExOne{
	double income = 4500.90;
	public double add(double i , double j){
	double result = i+j;
	return result;
	}
	public static void main(String...args){
	DefaultModifierExOne dm = new DefaultModifierExOne();
	System.out.println("Start of Main method");
	System.out.println(dm.income);
	double endResult = dm.add(34.53,23.12);
	System.out.println("Result is : "+endResult);
	System.out.println("End of the main method");
	}
}