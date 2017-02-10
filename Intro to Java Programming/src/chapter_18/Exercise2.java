package chapter_18;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Write Fibonacci Numbers using Iteration instead of Recursion **/

public class Exercise2 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      while (true) {
         try {
            System.out.print("Please enter an integer greater than 0: ");
            int number = input.nextInt();

            if (number < 0)
               continue;
            else {
               System.out.println("Fibonacci value is " + fib(number));
               input.close();
               break;
            }
         } catch (InputMismatchException e) {
            System.out.println("You did not enter an integer!");
            input.nextLine();
         }
      }

   }

   public static int fib(int num) {
      if (num == 0)
         return 0;
      else if (num == 1)
         return 1;
      else {
         int f0 = 0;
         int f1 = 1;
         int currentFib = 0;

         for (int i = 1; i < num; i++) {
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
         }
         return currentFib;
      }
   }
}
