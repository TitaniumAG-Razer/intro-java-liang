package chapter_22;

import java.util.Scanner;

/** Maximum consecutive decreasingly ordered substring */
public class Exercise1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String newString = input.nextLine();
      
      System.out.print("Maximum decreasing substring is: " + 
            maxSubstring(newString));
   }
   
   public static String maxSubstring(String s) {
      
      String max = "";
      String current = "";
      
      current += s.charAt(0);
      
      for (int i = 1; i < s.length(); i++) {
         if (s.charAt(i) > s.charAt(i-1)) {
            if (current.length() > max.length())
               max = current;
            
            current = s.charAt(i) + "";
         }
         else
            current += s.charAt(i);     
      }
      
      if (max.length() < current.length())
         max = current;
      
      return max;
   }
}
