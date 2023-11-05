public class ReverseInteger{
	public static void main(String...args){
		var numberToReverse = 123456;
		System.out.println(reverseInt(numberToReverse));

	}
	public static int reverseInt(int numberToReverse){
		var reminder = 0;
		var reverse = 0;

		while(numberToReverse>0){
			reminder = numberToReverse %10;
			reverse = reverse*10 +reminder;
			numberToReverse /= 10;
		}
		return reverse;

	}
}