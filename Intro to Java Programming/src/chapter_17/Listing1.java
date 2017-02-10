package chapter_17;

import java.io.*;

public class Listing1 {
   public static void main(String[] args) throws IOException {

      // Create output stream to a file
      try (FileOutputStream output = new FileOutputStream("temp.dat");) {
         for (int i = 1; i <= 10; i++)
            output.write(i);
      }

      // Create input stream for the file
      try (FileInputStream input = new FileInputStream("temp.dat");) {
         int value;
         while ((value = input.read()) != -1)
            System.out.print(value + " ");
      }
   }
}
