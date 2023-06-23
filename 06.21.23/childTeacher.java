/*private,public ,protected and <default> access modifers 
examples with same package sub class*/
package com.peter;
 class Teacher{
	int idNumber;
	private String name ;
	public String level ;
	protected int age;

	public Teacher(int idNumber,String level,int age){
		this.idNumber = idNumber;
		this.level = level;
		this.age = age;
	}

	public void setName(String name ){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public String getLevel(){
		return level;
	}

}
public class ChildTeacher extends Teacher{

	  public ChildTeacher(int idNumber, String level, int age) {
        super(idNumber, level, age);
    }

    public static void main(String[] args) {

        ChildTeacher t1 = new ChildTeacher(1,"low", 21);
        t1.setName("Bala");
        String name = t1.getName();

        System.out.println("Teacher level is: " + t1.getLevel());
        System.out.println("Teacher level is: " + t1.level);
        System.out.println("Teacher's age is: " + t1.age);
        System.out.println("the name is : "+name);

    }
}