package com.wyatt;
import com.venant.Docter;

public class DoctorMain{
	public static void main(String[]args){
		Docter d1 = new Docter();
		d1.setLicence(121);
		int docterLicence = d1.getlicenceNumber();
		System.out.println("The licence is :"+docterLicence);
	}
}