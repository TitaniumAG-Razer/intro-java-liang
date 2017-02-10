package chapter_6;

/** An emirp is a nonpalindromic prime number whose reveral is also a prime. 
 * Find the first 120 emirps. */
public class Exercise27 {
   public static void main(String[] args) {
      
      int count = 0; 
      int value = 13;
      
      while (count <= 120) {
         if (isEmirp(value)) {
            System.out.print(value + " ");
            count++;
            
            if (count % 10 == 0)
               System.out.println();
         }
         value++;
      }
   }
   
   public static boolean isEmirp(int number) {
      
      // Check if Palindrome
      if (isPalindrome(number))
         return false;
      
      // Check if Prime
      if (!isPrime(number))
         return false;
      
      // Check if reverse is prime
      if (!isPrime(reverseNumber(number)))
         return false;
      return true;
   }
   
   public static boolean isPalindrome(int number) {
      
      String s = number + "";
      for (int i = 0; i < s.length() / 2; i++) {
         if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            return false;
      }
      
      return true;
   }
   
   public static boolean isPrime(int number) {
      
      for (int i = 2; i <= (int)(Math.sqrt(number)); i++) {
         if (number % i == 0)
            return false;
      }
      
      return true;  
   }
   
   public static int reverseNumber(int number) {
      
      String s = "";
      int remainder = number;
      
      while (remainder != 0) {
         s += remainder % 10;
         remainder /= 10;
      }
      
      return Integer.parseInt(s);
      
   }
}
