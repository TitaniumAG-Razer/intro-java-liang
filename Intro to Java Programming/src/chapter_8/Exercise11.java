package chapter_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Game: Nine heads and tails */
public class Exercise11 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int value;

      while (true) {
         try {
            System.out.print("Enter a number between 0 and 511: ");
            value = input.nextInt();

            if (value < 0 || value > 511) {
               System.out.println("Out of bounds.");
               continue;
            }

            displayHeadsAndTails(binaryToString(value));
            input.close();
            break;
         } catch (InputMismatchException e) {
            System.out.println("Bad input.");
            input.nextLine();
         }
      }
   }

   /** Display the 9 heads and tails given a binary string */
   public static void displayHeadsAndTails(String binary) {
      for (int i = 0; i < binary.length(); i++) {
         if (binary.charAt(i) == '0')
            System.out.print("H ");
         else
            System.out.print("T ");

         if ((i + 1) % 3 == 0)
            System.out.println();
      }
   }

   /** Convert number to binary string */
   public static String binaryToString(int value) {

      String s = "";
      int remaining = value;

      for (int i = 0; i < 9; i++) {
         if (remaining >= Math.pow(2, 8 - i)) {
            s += "1";
            remaining -= Math.pow(2, 8 - i);
         } 
         else
            s += "0";
      }

      return s;
   }
}