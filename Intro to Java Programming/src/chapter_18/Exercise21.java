package chapter_18;

/** Convert decimal to binary using recursion */
public class Exercise21 {
   public static void main(String[] args) {
      
      int x = 8;
      int y = 64;
      int z = 65;
      
      System.out.println(dec2Bin(x));
      System.out.println(dec2Bin(y));
      System.out.println(dec2Bin(z));
   }
   
   public static String dec2Bin(int value) {
      return dec2Bin(value, "");
   }
   
   // Private helper method
   private static String dec2Bin(int value, String result) {
      if (value == 0)
         return result;
      else {
         return dec2Bin(value / 2, (value % 2) + result);
      }
   }
}
