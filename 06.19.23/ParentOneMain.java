package org.bala;
import com.venant.ParentOne;

public class ParentOneMain{
	public static void main(String...args){
		ParentOne p1 = new ParentOne();
		p1.setAge(21);
		int age = p1.getAge();

		p1.setSalary(25000);
		int sal = p1.getSalary();

		p1.setNumber(12);
		int myNumber = p1.getNumber();
	}
}