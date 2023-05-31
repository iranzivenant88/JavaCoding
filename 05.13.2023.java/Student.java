public class Student{
	public String name ="";
	public int age = 0;
	public String major ="Undeclared";
	public boolean fulltime = true;

	public void display(){
	System.out.println("Name:"+name+"Major:"+major);
	}
	public boolean isFullTime(){
	return fulltime;
	}
}
 class TestStudent{
	public static void main(String[]args){
	Student bob = new Student();
	Student jian = new Student();
	bob.name ="Bob";
	bob.age = 19;
	jian = bob;jian.name ="Jian";
	System.out.println("Bob's Name:"+bob.name);
	}
}


