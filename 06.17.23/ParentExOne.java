package com.vincent.parentone;
public class ParentExOne{
	protected double commission;
	protected void setCommission(double commission){
	 this.commission = commission;
	}
	protected double getCommission(){
		return commission;
	}
	  protected static int i = 45;
	  protected void n1(){
	  	System.out.println("n1-no parameter");
	  }
	  protected void n1(int i){
	  	System.out.println("n1 int parameter");
	  }
	  protected void n1(String s){
	  	System.out.println("n1 String parameter");
	  }
}

