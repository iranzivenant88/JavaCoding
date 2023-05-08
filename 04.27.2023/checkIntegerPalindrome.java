public class checkIntegerPalindrome{
	public static void main(String []args){
	int x = 12121;
	int i = 0;
	int j = x.length()-1;

	}
	public boolean isPalindrome(int x){
	String a = Integer.toString(x);
	while(x<j){
	if(a.charAt(i)==a.charAt(j)){
	i++;
	j++;

	}else{
	return false;
	}
	}
	return true;
	}
}