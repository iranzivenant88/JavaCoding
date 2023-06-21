//public access modifier, different package non sub-class
package com.venant;
public class Docter{
	int licenceNumber;

	public void setLicence(int licenceNumber){
	 this.licenceNumber = licenceNumber+1;
	}
	public int getlicenceNumber(){
		return licenceNumber ; 
	}
	
}