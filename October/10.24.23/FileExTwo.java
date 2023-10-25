package com.venant.fileexampletwo;
import java.io.File;
import java.io.IOException;
public class FileExTwo{
public static void main(String...args){
System.out.println("Start of Main Method");
File file = null;
try{
System.out.println("Start of try block");
file = new File("JavaNotes.pdf");
file.createNewFile();
System.out.println(file.exists());
System.out.println("End of try block");
}
catch(IOException ex){
ex.printStackTrace();
}
System.out.println("End of Main Method");
}// end of main method
}// end of class
