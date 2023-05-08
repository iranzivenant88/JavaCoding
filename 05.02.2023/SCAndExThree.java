public class SCAndExThree{
	public static void main(String[]args){
	byte b =  34;
	short j = 56;
	if(++j>67 && --b > 56 ){//j=57, b= 34
	System.out.println(j);//
	++j;
	System.out.println(j);
	}else{
	System.out.println(b);//b=34
	b--;//b = 33
	System.out.println(b);//33
	}
	
	}
}