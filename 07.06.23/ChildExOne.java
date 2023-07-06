
public class ChildExOne extends ParentExOne{
	String name ;
	int age;
	public ChildExOne(String name , int age){
		System.out.println("Name is : " +name+ " Age is : " +age);
	}

	public ChildExOne(String name){
		this();
		this.name = name;
		System.out.println("Name is : "+name);
	}
	public ChildExOne(){
		System.out.println("ChildOne-constructor with no parameter");

	}	
	
}