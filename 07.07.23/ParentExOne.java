public class ParentExOne{

	public ParentExOne(){
		System.out.println("No-parameter constructor");
	}
	public ParentExOne(int i){
		this(10.5);
		System.out.println("int-parameter constructor");

	}
	public ParentExOne(double d){
		this();
		System.out.println("double-parameter constructor");
	}
	

}
	
