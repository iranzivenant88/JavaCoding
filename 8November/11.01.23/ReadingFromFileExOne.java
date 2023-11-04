package com.venant.filehandling.exampleone;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileExOne {
    public static void main(String... args) {
        System.out.println("Start of Main Method");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            System.out.println("Start of try block");
            fileReader = new FileReader("Author.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            System.out.println("End of try block");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Start of Finally Block");
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("End of Finally Block");
        }//end of finally block;
    }
}
