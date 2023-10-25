package com.venant.fileexampleone;
import java.io.File;
import java.io.IOException;
public class FileExOne
{
	public static void main(String[] args)
	{
		System.out.println("Start of Main Method");
		File file = null;
		try{
		System.out.println("Start of try block");
		//System.out.println(file.exists());
		 file = new File("fileOne.txt");
		 file.createNewFile();
		System.out.println(file.exists());

		System.out.println("End of try block");
		}

		catch(IOException ex){
		ex.printStackTrace();
		}
		// finally{
		// 	try{
		// 		if(file!= null)
		// 			file.close();
		// }
		// 	catch(Exception ex) {
		// 	ex.printStackTrace ();
		// 	}
		// }


	System.out.println("End of Main Method");
	}// close of main method
}// close of class