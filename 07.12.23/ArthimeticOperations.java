public class ArthimeticOperations{
	public static int add(int a, int b){
		return a +b;
	}
	public static int divide(int a, int b){
		if(b==0){
			throw new IllegalArgumentException("Can't dive a number with 0");
		}
		return a/b;
	} 

	
}