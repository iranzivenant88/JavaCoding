public class IDEXNine{
	public static void main(String[]args){
	System.out.println("Start of main method");
	int i = 45;
	int j = --i; //i =44 j =44
	j++; // j =45
	int a =i++; //a = 44 //i = 45
	--i; // i =44
	int b =++j; // 46 // b = 46
	--a; // a = 43
	int g= ++a; // a = 44 // g = 44 
	System.out.println("The value of i is :"+i);// 44
	System.out.println("The value of j is :"+j); // 46 
	System.out.println("The value of a is :"+a); // 44
	System.out.println("The value of b is :"+b); // b = 46
	System.out.println("The value of g is :"+g); // 44
	System.out.println("End of main method ");
	}
}