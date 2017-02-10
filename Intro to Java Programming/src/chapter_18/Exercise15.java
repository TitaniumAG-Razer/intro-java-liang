package chapter_18;

/** This program counts the occurrences of a specified character in a string */
public class Exercise15 {
   public static void main(String[] args) {
      
      String s = "Susie had several sour days";
      System.out.println(count(s, 's', s.length()));
   }

   
   public static int count(String str, char a, int high) {
      return count(str, a, str.length() - 1, 0);
   }
   
   private static int count(String str, char a, int high, int count) {
      if (high < 0)
         return count;
      else if (str.charAt(high) == a)
         return count(str, a, high - 1, count + 1);
      else
         return count(str, a, high - 1, count);
   }
}
