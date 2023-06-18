package com.chris.childone;
import com.vincent.parentone.ParentExOne;
public class ChildExOne extends ParentExOne{
	protected String name ;
	protected void setName(String name){
		this.name = name ;
	}
	protected String getName(){
		return name ;
	}
	public static void main(String...args){
		System.out.println("Start of Main method");
		ParentExOne pe = new ParentExOne();
		double parentCommission = pe.getCommission();
		ChildExOne ce = new ChildExOne();
		ce.setCommission(12000.00);
		double childCommission = ce.getCommission();
		ce.n1("Harris");
		pe.n1();
		ce.setName("Harris");
		String childName = ce.getName();
		System.out.println("End of main method");
	}
}