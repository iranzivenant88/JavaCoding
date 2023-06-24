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
	System.out.println("The Teacher id is : " +idNumber+ " , The teacher Level is : "+level+" , The teacher age is : "+age);
	}

	// public void setName(String name ){
	// 	this.name = name;
	// }

	public void displayName(String name){
		System.out.println("The teacher's name is : "+name);
		//return name;
	}


}
public class ChildTeacher extends Teacher{

	  public ChildTeacher(int idNumber, String level, int age) {
        super(idNumber, level, age);
    }

    public static void main(String[] args) {
        ChildTeacher t1 = new ChildTeacher(1,"low", 21);
        ChildTeacher t2 = new ChildTeacher(3,"Medium",23);
        //t1.setName("Bala");
        //String name1 = t1.getName();
        t1.displayName("Bala");
        t2.displayName("Prof.Sam");
        //System.out.println("Name one is : "+name1);

        // t2.setName("Prof. Sam");
        // String name2 = t2.getName();

        

    }
}