package chapter_22;

import java.util.Scanner;

/** Pattern Matching */
public class Exercise3 {
   public static void main(String[] args) {
      
      String first, second;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string s1: ");
      first = input.nextLine();
      System.out.print("Enter a string s2: ");
      second = input.nextLine();
      
      // Algorithm: Get first char of s2, and check all chars
      // of s1. Stop each time it matches, and check remaining
      // chars 
      char c = second.charAt(0);
      for (int i = 0; i < first.length() - second.length(); i++) {
         if (first.charAt(i) == c) {
            if (first.substring(i, i + second.length()).equals(second)) {
               System.out.println("Matched at index " + i);
               return;
            }
         }
      }
      
      System.out.println("No matching substring found.");
   }
}
