package chapter_18;

/** Find the number of lower case letters in a string */
public class Exercise14 {
   public static void main(String[] args) {
      
      String s = "Happy New Years! By the way, this string has "
            + "46 lowercase letters.";
      System.out.println(countLowerLetters(s));
   }
   
   public static int countLowerLetters(String s) {
      return countLowerLetters(s, s.length() - 1, 0);
   }
   
   // Private helper method that uses tail recursion
   private static int countLowerLetters(String s, int index, int count) {
      if (index < 0)
         return count;
      else if (Character.isLowerCase(s.charAt(index)))
         return countLowerLetters(s, index - 1, ++count);
      else
         return countLowerLetters(s, index - 1, count);
   }
}
