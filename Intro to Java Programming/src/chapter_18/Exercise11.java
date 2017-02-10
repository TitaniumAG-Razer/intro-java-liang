package chapter_18;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Multiply digits in a long integer using recursion **/
public class Exercise11 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      try {
         System.out.print("Please enter a long: ");
         Long value = input.nextLong();

         int multiplyDigits = mulDigits(value);
         System.out.println(multiplyDigits);
         input.close();
      } catch (InputMismatchException e) {
         System.out.println("You did not enter the requested input properly!");
      }
   }

   public static int mulDigits(long n) {
      if (Math.abs(n) < 10)
         return (int) n;
      else
         return (int) ((n % 10) * mulDigits(n / 10));
   }
}
