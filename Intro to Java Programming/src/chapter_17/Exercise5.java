package chapter_17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/** Store objects and arrays in a file **/
public class Exercise5 {
   public static void main(String[] args) {

      int[] arr = new int[6];

      for (int i = 1; i <= 6; i++)
         arr[i - 1] = i;

      Date date = new Date();

      double val = 10.5;

      try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))) {

         output.writeObject(arr);
         output.writeObject(date);
         output.writeDouble(val);

         System.out.println("Successfully written.");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
