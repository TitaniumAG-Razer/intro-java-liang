package chapter_17;

import java.io.*;
import java.util.Scanner;

/** Encrypt a file by adding 10 to every byte in the file */
public class Exercise14 {
   public static void main(String[] args) throws 
   FileNotFoundException, IOException {

      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a file to encrypt: ");
      File inputFile = new File(input.next());
      System.out.println("Please enter an output file: ");
      File outputFile = new File(input.next());


      try (
            BufferedInputStream in = new BufferedInputStream(
                  new FileInputStream(inputFile));
            BufferedOutputStream output = new BufferedOutputStream(
                  new FileOutputStream(outputFile));
            ) {
         int value;
         while ((value = in.read()) != -1) {
            output.write(value + 5);
         }
         output.close();
         input.close();
      }
   }
}

