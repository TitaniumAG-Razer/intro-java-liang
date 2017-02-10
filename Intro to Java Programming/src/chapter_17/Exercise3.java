package chapter_17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** This program sums all the floating points in a binary data file **/

public class Exercise3 {
   public static void main(String[] args) throws FileNotFoundException, IOException {

      // Make a file Exercise17_03.dat
      try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"))) {

         for (int i = 0; i < 10; i++)
            output.writeFloat(2.5F);
      }

      // Now read the data
      double sum = 0;
      try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"))) {

         while (true)
            sum += input.readFloat();

      } catch (EOFException ex) {
         System.out.println("All Data were Read.");
      } catch (IOException e) {
         e.printStackTrace();
      }

      System.out.println("Sum of all floating numbers in the file is " + sum); // should
                                                                               // be
                                                                               // 25.0
   }
}
