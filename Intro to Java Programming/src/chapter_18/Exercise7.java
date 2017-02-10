package chapter_18;

import java.util.InputMismatchException;

/** Calculate number of times the recursive Fibonacci method is called **/

import java.util.Scanner;

public class Exercise7 {
   /** Main method */
   public static void main(String[] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an index for a Fibonacci number: ");
      int index = input.nextInt();

      if (index < 0) {
         System.out.println("You must enter an integer greater than or equal" + " to 0.");
         return;
      }

      try {
         System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
         System.out.println("The fib method was called " + count + " times.");
      } catch (InputMismatchException e) {
         e.printStackTrace();
      }

   }

   /** The method for finding the Fibonacci number */
   public static long fib(long index) {
      count++;
      if (index == 0) // Base case
         return 0;
      else if (index == 1) // Base case
         return 1;
      else // Reduction and recursive calls
         return fib(index - 1) + fib(index - 2);
   }

   public static int count = 0;
}
