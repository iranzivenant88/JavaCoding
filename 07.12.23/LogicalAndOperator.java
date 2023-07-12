public class LogicalAndOperator{
	public static void main(String...args){
	byte b =34;
	short j = 56;
	if(++j<67 && --b >56){
		j++;
		System.out.println(j);
	}else{
		System.out.println(b);
		b--;
		System.out.println(b);
	}
	}
}