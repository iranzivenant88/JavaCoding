public class StringExample{
	public static void main(String...args){
	String str = "Hello";	
	String result = reverseString(str.toString());
	System.out.println(result);

	}
	public static String reverseString(String str){
		int i = 0;
		int j = str.length()-1;
		char [] st = str.toCharArray();
		while(i<j){
		char temp = st[j];
		st[j] = st[i];
		st[i] = temp;
		i++;
		j--;
		}
		return new String(st);
		//System.out.println(Arrays.toString());
	}
}