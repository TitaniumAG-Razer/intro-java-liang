package chapter_17;

import java.io.*;

/**
 * Write a program to create a new text file if it does not exist. Append new
 * data to it if it already exists.
 * 
 * Write 150 integers created randomly into the file using text I/O.
 * 
 * @author Kevin
 *
 */
public class Exercise1 {
   public static void main(String[] args) throws FileNotFoundException {

      File testFile = new File("Exercise17_01.txt");
      PrintWriter output;

      if (!testFile.exists()) { // write new integers
         output = new PrintWriter(testFile);
      } else { // append
         output = new PrintWriter(new FileOutputStream(testFile, true));
      }

      for (int i = 0; i < 150; i++) {
         output.print((int) (Math.random() * 5000));
         output.print(" ");

         // 10 per line
         if ((i + 1) % 10 == 0 && (i + 1) / 10 >= 1)
            output.println();
      }

      output.close();
   }
}
