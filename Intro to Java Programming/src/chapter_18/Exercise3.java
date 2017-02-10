package chapter_18;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Compute GCD (Greatest Common Divisor) using recursion **/

public class Exercise3 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      try {
         System.out.print("Please enter 2 integers: ");
         int m = input.nextInt();
         int n = input.nextInt();

         System.out.println("GCD is " + gcd(m, n));
      } catch (InputMismatchException e) {
         System.out.println("Bad input.");
      } catch (ArithmeticException e) {
         System.out.println("Cannot divide by zero");
      }
   }

   public static int gcd(int m, int n) {

      if (m % n == 0)
         return n;
      else
         return gcd(n, m % n);
   }
}
