public class IDEXNine{
	public static void main(String[]args){
	System.out.print("Start of main method");
	int i = 45;
	int j = --i;
	j++;
	int a =i++;
	--i;
	int b =++j;
	--a;
	int g= ++a;
	System.out.println("The value of i is :"+i);
	System.out.println("The value of j is :"+j);
	System.out.println("The value of a is :"+a);
	System.out.println("The value of b is :"+b);
	System.out.println("The value of g is :"+g);
	System.out.println("End of main method ");
	}
}