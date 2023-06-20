package com.claire;
import com.venant.ParentTwo;

public class ParentTwoMain extends ParentTwo{
	public static void main(String...args){
		ParentTwo p2 = new ParentTwo();
		p2.setZipCode(67034);
		int zip = p2.getZipCode();
		
		p2.setBoxNumber(2341);
		int boxNumber = p2.getBoxNumber();
		p2.setPhoneNumber(3253434L);
		int phoneNumber = p2.getPhoneNumber();

		System.out.println("box number is :" +boxNumber);
		System.out.println("Phone number is :"+phoneNumber);

		
	}
}