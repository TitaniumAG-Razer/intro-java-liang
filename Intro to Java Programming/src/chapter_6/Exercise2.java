package chapter_6;

/** Multiply the digits in an integer */
public class Exercise2 {
   public static void main(String[] args) {
      
      System.out.println(mulDigits(123456789));
   }
   
   public static int mulDigits(long n) {
      
      int product = 1;
      long remainder = n;
      
      while (remainder != 0) {
         product *= (remainder % 10);
         remainder /= 10;
      }
      
      return product;
   }
}
