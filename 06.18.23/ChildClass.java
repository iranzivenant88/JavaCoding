package bala.friend.sam;
import com.wyatt.ParentClass;
public class ChildClass{
	public static void main(String...args){
		System.out.println("Starts of main method");
		ParentClass pc = ParentClass();
		pc.setSalary(4000);
		int salary = pc.getSalary();
		System.out.println("The salary is : "+salary);
		System.out.println("End of main method");	
	}

}