public class StringExThree{
	public static void main(String[]args){
	String s1 = new String("Keyle");
	String s2 = new String ("Harris");
	String s3 = s1.concat(s2);
	String s4 = "Jack";
	String s5 = "Nathan";
	String s6 = s4 + s5 ;
	String s7 ="Venant";
	String s8 = "Abhajah";
	String s9 = new String("Venant");
	String s10 = new String ("Abhajah");

	System.out.println(s1);//Keyle
	System.out.println(s2);//Harris
	System.out.println(s3);//KeyleHarris
	System.out.println(s4);//Jack
	System.out.println(s5);//Nathan 
	System.out.println(s6);//JackNathan
	System.out.println(s7);//Venant
	System.out.println(s8);//Abhajah
	System.out.println(s9);//Venant
	System.out.println(s10);//Abhajah
	System.out.println("End of the main method");

	}
Keyle
Harris
KeyleHarris
Jack
Nathan
JackNathan
VenantAbhajah
Abhajah
Venant
Abhajah
End of the main method

}