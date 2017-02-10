package chapter_18;

public class Exercise24 {
   public static void main(String[] args) {
      String s = "AFE";
      String t = "6566";
      
      System.out.println(hex2Dec(s));
      System.out.println(hex2Dec(t));
   }
   
   public static int hex2Dec(String hexString) {
      return hex2Dec(hexString, 0);
   }
   
   // Helper Method
   private static int hex2Dec(String hexString, int result) {
      if (hexString.length() == 0)
         return result;
      else if (hexString.charAt(0) <= '9' && hexString.charAt(0) >= '0')
         return hex2Dec(hexString.substring(1), 
               result + (hexString.charAt(0) - '0') * 
               (int)(Math.pow(16, hexString.length() - 1)));
      else
         return hex2Dec(hexString.substring(1), 
               result + (hexString.charAt(0) - 'A' + 10) * 
               (int)(Math.pow(16, hexString.length() - 1)));
   }
}

