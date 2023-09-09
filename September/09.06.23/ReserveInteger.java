public class ReserveInteger{
	public static void main(String...args){
		int a = 12345;
		int reverse;

		StringBuilder stb = new StringBuilder(String.valueOf(a));
		reverse = Integer.valueOf(stb.reverse().toString());
		System.out.println(reverse);
	}
}