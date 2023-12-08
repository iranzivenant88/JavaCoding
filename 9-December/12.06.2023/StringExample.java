public class StringExample{
	public static void main(String...args){
	String str = "Hello";	
	System.out.println(reverseString(str));

	}
	public static void reverseString(String str){
		int i = 0;
		int j = str.length-1;
		while(i<j){
		char temp = str[j];
		str[j] = str[i];
		str[i] = temp;
		i++;
		j--;
		}
	}
}