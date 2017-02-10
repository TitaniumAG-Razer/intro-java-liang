package chapter_22;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Same number sequence */
public class Exercise5 {
   public static void main(String[] args) {

      String userInput = ""; // holds the user input
      int nextValue; // retrieve next value from Scanner

      System.out.println("Enter a series of numbers ending with 0: ");
      Scanner input = new Scanner(System.in);

      try {
         nextValue = input.nextInt();

         while (nextValue != 0) {
            userInput += nextValue;
            nextValue = input.nextInt();
         }

         // Now get the maximum sequence
         if (userInput.length() == 0) { // nothing 
            System.out.println("Longest sequence is 0.");
         }
         else {
            
            String maxString = "";
            int maxLength = 1; // counter to hold max substring length 
            int counter = 1; // to keep track of which "number" we are on
            String substring = "" + userInput.charAt(0); // initialize at first char

            while (counter < userInput.length()) {

               // get the character at the current counter
               char c = userInput.charAt(counter);

               // current counter matches the last character in substring 
               if (substring.endsWith(c + "")) {
                  substring += c;
               }
               else {
                  // does not match, so refresh the substring
                  substring = "" + c;
               }
               

               // Update maxlength
               if (substring.length() > maxLength) {
                  maxLength = substring.length();
                  maxString = substring;
               }                  
               
               counter++;
            }

            System.out.println("Longest same number sequence starts at index " + 
                  userInput.indexOf(maxString) + " with " + maxLength
                  + " values of " + maxString.charAt(0));
         }
      }
      catch (InputMismatchException e) {
         e.printStackTrace();
      }
   }
}
