package chapter_18;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Using the BigInteger class in 10.9, write a program that prompts the user to
 * enter an integer and display its factorial.
 * 
 * @author Kevin
 *
 */

public class Exercise1 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Please enter an integer: ");
      String bigInt = input.next();

      try {
         long value = Long.parseLong(bigInt);
         System.out.println(value + "! is " + factorial(value));
         input.close();
      } catch (InputMismatchException e) {
         System.out.println("Your input is not in correct format.");
      }
   }

   public static BigInteger factorial(long n) {
      BigInteger result = BigInteger.ONE;
      for (int i = 1; i <= n; i++)
         result = result.multiply(new BigInteger(i + ""));

      return result;
   }
}
