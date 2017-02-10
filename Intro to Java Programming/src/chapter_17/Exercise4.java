package chapter_17;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/** Convert a text file to UTF **/
public class Exercise4 {
   public static void main(String[] args) {

      if (args.length != 2) {
         System.out.println("Command line format should be: [Text File] [UTF File]");
         return;
      }

      File file = new File(args[0]);

      // File does not exist
      if (!file.exists()) {
         System.out.println("Text file does not exist.");
         return;
      }

      String s = "";

      // Read from args[0] text file
      try {
         Scanner input = new Scanner(file);
         while (input.hasNextLine())
            s += input.nextLine();

         input.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }

      // Write in UTF format
      try (DataOutputStream output = new DataOutputStream(new FileOutputStream(args[1]))) {

         output.writeUTF(s);
         System.out.println("Succesfully written string in UTF form.");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
