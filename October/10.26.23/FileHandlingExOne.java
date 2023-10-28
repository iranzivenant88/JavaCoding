package com.venant.filehandling.exampleone;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExOne {
    public static void main(String... args) {
        System.out.println("Start of Main Method");
        FileWriter fileWriter = null;
        try {
            System.out.println("Start of try block");
            fileWriter = new FileWriter("ExampleTwo.xls");
            fileWriter.write(97);
            fileWriter.write("\n");
            fileWriter.write("James");
            fileWriter.write("\n");
            fileWriter.write('A');
            System.out.println("End of try block");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("End of Main Method");
    }
}
