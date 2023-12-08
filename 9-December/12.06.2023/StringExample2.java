public class StringExample2{
	public static void main(String...args){
	String str = "Hello";	
	StringBuilder stb = new StringBuilder();
	System.out.println(stb.append(str).reverse().toString());

	}
}