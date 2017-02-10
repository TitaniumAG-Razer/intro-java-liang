package chapter_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This program writes 150 integers to a file in binary I/O. If the file already
 * exists, it appends 150 integers to the existing file.
 * 
 * @author Kevin
 *
 */
public class Exercise2 {
   public static void main(String[] args) throws 
   IOException, FileNotFoundException {

      File file = new File("Exercise17_02.dat");

      if (file.exists()) {
         FileOutputStream output = new FileOutputStream("Exercise17_02.dat", true);
         for (int i = 0; i < 150; i++)
            output.write((int) (Math.random() * 500));

         System.out.println("Append complete.");
         output.close();
      } else {
         FileOutputStream output = new FileOutputStream("Exercise17_02.dat");

         for (int i = 0; i < 150; i++)
            output.write((int) (Math.random() * 500));

         System.out.println("Writing complete.");
         output.close();
      }

      try (FileInputStream input = new FileInputStream("Exercise17_02.dat");) {
         int value;

         while ((value = input.read()) != -1)
            System.out.print(value + " ");
      }
   }
}
