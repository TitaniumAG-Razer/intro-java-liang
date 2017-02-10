package chapter_4;

import java.util.Scanner;

/** Enter three countries and display them in descending order */
public class Exercise24 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      String first, second, third = "";
      
      System.out.print("Enter the first country: ");
      first = input.next();
      System.out.print("Enter the second country: ");
      second = input.next();
      System.out.print("Enter the third country: ");
      third = input.next();
      
      if (first.compareToIgnoreCase(second) > 0) {
         if (second.compareToIgnoreCase(third) > 0)
            System.out.println("The three countries in descending order are "
                  + first + ", " + second + ", and " + third + ".");
         else if (first.compareToIgnoreCase(third) > 0)
            System.out.println("The three countries in descending order are "
                  + first + ", " + third + ", and " + second + ".");
         else 
            System.out.println("The three countries in descending order are "
                  + third + ", " + first + ", and " + second + ".");
      }
      else { // first < second
         if (second.compareToIgnoreCase(third) < 0)
            System.out.println("The three countries in descending order are "
                  + third + ", " + second + ", and " + first + ".");
         else if (first.compareToIgnoreCase(third) > 0)
            System.out.println("The three countries in descending order are "
                  + second + ", " + first + ", and " + third + ".");
         else
            System.out.println("The three countries in descending order are "
                  + second + ", " + third + ", and " + first + ".");
      }
   }
}
