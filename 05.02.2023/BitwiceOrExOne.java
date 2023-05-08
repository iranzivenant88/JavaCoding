public class BitwiceOrExOne{
	public static void main(String[]args){
	int h = 34;
	int j = 56;
	if(++h>56 | j--<45){
	h++;
	}else{
	--j;
	}
	System.out.println(h +"...."+j);

	}
}