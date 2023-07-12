public class BitwiceOrEx1{
	public static void main(String...args){
	int k = 23;
	int j = 78;
	if(--k>67 | ++j<89){
		System.out.println("Hi");
		j++;
	}
	else{
	System.out.println("Hey");
		k++;
	}
	System.out.println(j+"..."+k);
	}
}