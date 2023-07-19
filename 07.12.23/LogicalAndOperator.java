public class LogicalAndOperator{
	public static void main(String...args){
	byte b =34;
	short j = 56;
	if(++j<67 && --b >56){//j = 56 , b = 33
		j++;
		System.out.println(j);
	}else{
		System.out.println(b);// 33
		b--; 
		System.out.println(b);//32
	}
	}
}