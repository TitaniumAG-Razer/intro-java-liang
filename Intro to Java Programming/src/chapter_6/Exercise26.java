package chapter_6;

/** Write a program that displays the first 120 palindromic prime numbers.
 * A palindromic prime is a number that is both a palindrome and prime. */

public class Exercise26 {
   public static void main(String[] args) {
      
      int count = 0;
      int value = 2;
      
      while (count <= 120) {
         if (isPalindromicPrime(value)) {
            System.out.print(value + " ");
            count++;
            
            if (count % 10 == 0)
               System.out.println();
         }
         
         if (value % 2 != 0)
            value += 2;
         else
            value++;
      }
   }
   
   public static boolean isPalindromicPrime(int number) {
      
      // Check if palindrome
      String s = number + "";
      for (int i = 0; i < s.length() / 2; i++) {
         if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            return false;
      }
      
      // Check if prime
      for (int i = 2; i <= (int)(Math.sqrt(number)); i++) {
         if (number % i == 0)
            return false;
      }
      
      return true;  
   }
}
