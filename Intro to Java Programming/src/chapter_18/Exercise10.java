package chapter_18;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Count occurrences of specified character in a string USING recursion **/
public class Exercise10 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      try {
         System.out.print("Please enter a string and a char: ");
         String s = input.next();
         char a = input.next().charAt(0);

         count(s, a);
         System.out.println(a + " occurred " + occurrences + " times.");
         input.close();
      } catch (InputMismatchException e) {
         System.out.println("You did not enter the requested input properly!");
      }
   }

   public static int count(String str, char a) {

      int lastCharIndex = str.length() - 1;

      if (str.charAt(lastCharIndex) == a)
         occurrences++;

      if (lastCharIndex > 0) {
         String newString = str.substring(0, lastCharIndex);
         return count(newString, a);
      } else
         return 1;
   }

   public static int occurrences = 0;
}
