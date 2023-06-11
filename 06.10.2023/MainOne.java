class ParentExOne{
	public Number m2(){
		return 12;
	}
}

class ChildExOne{
	public Integer m2(){
		return 1;

	}
}
	
public class MainOne{
	public static void main(String...args){
		ChildExOne co = new ChildExOne();
		co.m2();
		System.out.println("End of Main method");
	}
		
}

