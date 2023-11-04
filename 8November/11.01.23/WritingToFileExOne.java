package org.venant.filehandling.exampleone;
import java.io.PrintWriter;
import java.io.IOException;

public class WritingToFileExOne {
    public static void main(String... args) {
        System.out.println("Start of Main Method");
        PrintWriter printWriter = null;
        String authorName = null;
        int authorAge = 0;
        double authorIncome = 0.0;

        try {
            System.out.println("Start of try block");
            authorName = args[0];
            authorAge = Integer.parseInt(args[1]);
            authorIncome = Double.parseDouble(args[2]);

            printWriter = new PrintWriter("Author.txt");
            System.out.println("Writing Author Information to the file");
            printWriter.println("====================================");
            printWriter.println("Author Information:");
            printWriter.println("Author Name is = " + authorName);
            printWriter.println("Author Age is = " + authorAge);
            printWriter.println("Author Income is = " + authorIncome);
            printWriter.println("=====================================");
            System.out.println("End of try block");
        } //end of try block
        catch (IOException ex) {
            ex.printStackTrace();

        } 
        catch (Exception ex) {
            ex.printStackTrace();
        } 
        finally {
            System.out.println("Start of Finally Block");
            try {
                if (printWriter != null)
                    printWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("End of Finally Block");
        }//end of finally block
        System.out.println("End of Main Method");
        }//end of class 
}
