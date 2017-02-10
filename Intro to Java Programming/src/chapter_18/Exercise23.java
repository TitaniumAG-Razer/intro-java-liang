package chapter_18;

/** Recursive binary to decimal */
public class Exercise23 {
   public static void main(String[] args) {
      
      String s = "1101";
      String t = "110101010101";
      
      System.out.println(bin2Dec(s));
      System.out.println(bin2Dec(t));
   }
   
   public static int bin2Dec(String binaryString) {
      return bin2Dec(binaryString, 0);
   }
   
   private static int bin2Dec(String binaryString, int result) {
      if (binaryString.length() == 0)
         return result;
      else if (binaryString.charAt(0) == '1')
         return bin2Dec(binaryString.substring(1), result + 
               (int)Math.pow(2, binaryString.length() - 1));
      else
         return bin2Dec(binaryString.substring(1), result);
   }
}
