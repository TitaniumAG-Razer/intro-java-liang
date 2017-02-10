package chapter_6;

/** Method returns greatest common denominator */
public class Exercise4 {
   public static int gcd(int num1, int num2) {

      if (num1 == 0 || num2 == 0) {
         throw new IllegalArgumentException("No possible GCD with value of 0.");
      }

      if (num1 == num2)
         return num1;
      else if (num1 > num2)
         return gcd(num1 - num2, num2);
      else
         return gcd(num2, num2 - num1);
   }


   public static void main(String[] args) {
      System.out.println("Greatest GCD of 48 and 1040 is " + gcd(48, 1040));
      System.out.println("Greatest GCD of 75 and 1050 is " + gcd(75, 1050));
   }
}
