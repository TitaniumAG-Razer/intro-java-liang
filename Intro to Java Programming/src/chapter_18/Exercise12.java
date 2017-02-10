package chapter_18;

import java.util.Scanner;

/**
 * Print the characters in the string reversely, this time using a helper
 * command to pass the substring high index to the method
 **/
public class Exercise12 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Type a string: ");
      String s = input.next();

      reverseDisplay(s, getHigh(s));
      input.close();
   }

   public static void reverseDisplay(String value, int high) {

      System.out.print(value.charAt(high));

      if (high > 0) {
         String newString = value.substring(0, high);
         reverseDisplay(newString, getHigh(newString));
      }
   }

   public static int getHigh(String value) {
      return value.length() - 1;
   }

}
