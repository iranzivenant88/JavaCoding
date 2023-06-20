package com.venant;

public class ParentTwo{
	private int zipCode = 84088;
	protected int boxNumber = 23;
	long phoneNumber = 2349583L;


	public int getZipCode(){
		return zipCode;
	}

	public void setZipCode(int zipCode){
		this.zipCode = zipCode;
	}

	protected int getBoxNumber(){
		return zipCode;
	}

	protected void setBoxNumber(int boxNumber){
		this.boxNumber = boxNumber;
	}

	protected long getPhoneNumber(){
		return phoneNumber;
	}

	protected void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	
}