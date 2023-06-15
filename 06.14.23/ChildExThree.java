package child.packagetest.examples;
import defaultpackage.venu.examples.ParentExThree;
public class ChildExThree extends ParentExThree{
	String name;
	void setName(String name){
		this.name = name ;
	}
	String getName(){
		return name ;
	}
	public static void main(String...args){
		System.out.println("Star of the Main method");
		ParentExThree pe = new ParentExThree();
		pe.setPassword("Harris");
		String userPassword = pe.getPassword();
		ChildExThree ce = new ChildExThree();
		ce.setName("venant");
		ce.setPassword("Venant@1234");
		String childName = ce.getName();
		String childPassword = ce.getPassword();
	}
}