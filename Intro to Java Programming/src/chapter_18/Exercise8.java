package chapter_18;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Recursive method that displays an int value reversely on the console **/
public class Exercise8 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      try {
         System.out.print("Enter an integer: ");
         int value = input.nextInt();
         if (value < 0)
            System.out.print("-");
         reverseDisplay(value);
         input.close();
      } catch (InputMismatchException e) {
         System.out.println("You did not enter an integer!");
      }
   }

   public static void reverseDisplay(int value) {
      if (Math.abs(value) < 9)
         System.out.print((int) (Math.abs(value)));
      else {
         System.out.print((int) (Math.abs(value)) % 10);
         reverseDisplay((int) (Math.abs(value)) / 10);
      }
   }
}
