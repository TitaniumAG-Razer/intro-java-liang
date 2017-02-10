package chapter_18;

import java.util.Scanner;

/** Print Characters in a String in reverse **/
public class Exercise9 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Type a string: ");
      String s = input.next();

      reverseDisplay(s);
      input.close();
   }

   public static void reverseDisplay(String value) {
      int lastTerm = value.length() - 1;
      System.out.print(value.charAt(lastTerm));

      if (lastTerm > 0) {
         String newString = value.substring(0, lastTerm);
         reverseDisplay(newString);
      }
   }
}
