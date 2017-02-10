package chapter_18;

public class Exercise22 {
   public static void main(String[] args) {
      int x = 15;
      int y = 16 * 16 - 1;
      int z = 2500;
      
      System.out.println(dec2Hex(x));
      System.out.println(dec2Hex(y));
      System.out.println(dec2Hex(z));
   }
   
   public static String dec2Hex(int value) {
      return dec2Hex(value, "");
   }
   
   // private helper method for main recursive method
   private static String dec2Hex(int value, String result) {
      if (value == 0)
         return result;
      else if (value % 16 < 10)
         return dec2Hex(value / 16, (value % 16) + result);
      else
         return dec2Hex(value / 16, (char)(('A') + (value % 16 - 10)) 
               + result);
   }
}