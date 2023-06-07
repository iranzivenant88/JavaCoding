class Person{
	String name;
	int age;
	boolean isMale;
	
	public Person(){
	name = "James";
	age = 61;
	isMale = true;
	System.out.println("Name: "+name+ "Age is : "+age);
	}
	public Person(String name , int age , boolean isMale){
	this.name = name ;
	this.age = age;
	this.isMale = isMale;
	}
	public void increaseAge(int incr){
	age = age+incr;
	}
	public void increaseAge(){
	age =age+10;
	}
	public String toString(){
	return "Your Name is :"+name+ ", your age is : "+age;
	}
	public static void main(String[]args){
	Person p1 = new Person();
	Person p2 = new Person("Stephene",31,false);
	Person p3 = new Person("Clara",23,false);
	Person p4 = new Person("John",34,true);
	p2.increaseAge();
	p3.increaseAge(5);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);

	}

}