package org.venant.filehandling.exampletwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExTwo {
    public static void main(String[] args) {
        System.out.println("Start of Main Method");
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            System.out.println("Start of try block");
            fileWriter = new FileWriter("Example4.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(98);
            bufferedWriter.newLine();
            bufferedWriter.write("James");
            bufferedWriter.newLine();
            bufferedWriter.write('a');
            bufferedWriter.newLine();
            bufferedWriter.write(122);
            bufferedWriter.newLine();
            bufferedWriter.write("Patric");

           // bufferedWriter.flush();
            System.out.println("End of try block");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Start of finally block");
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("End of finally block");
        }
        System.out.println("End of main method");
    }
}
