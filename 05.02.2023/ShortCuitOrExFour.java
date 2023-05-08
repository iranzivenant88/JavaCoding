public class ShortCuitOrExFour{
	public static void main(String[]args){
	short s = 45;
	byte  b = 65;
	if(++s>67 ||--s<34){
	s++;
	--s;
	System.out.println("The value of s is: "+s);
	System.out.println("Value of s is : "+s);
	}else{
	System.out.println(b);
	b--;
	++b;
	}
	System.out.println("End of main the main");

	}
}