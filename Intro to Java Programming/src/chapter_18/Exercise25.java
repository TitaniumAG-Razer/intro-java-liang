package chapter_18;

/** Display all the permutations of a String */
public class Exercise25 {
   public static void main(String[] args) {

      String x = "abc";
      String g = "abcde";

      displayPermutation(x);
      System.out.println("=====================");
      displayPermutation(g);
   }

   public static void displayPermutation(String s) {
      displayPermutation("", s);
   }

   // Private helper method
   private static void displayPermutation(String s1, String s2) {
      if (s2.equals(""))
         System.out.println(s1);
      else {
         for (int i = 0; i < s2.length(); i++) {
            if (i == 0)
               displayPermutation(s1 + s2.charAt(0), s2.substring(1));
            else if (i == s2.length() - 1)
               displayPermutation(s1 + s2.charAt(s2.length() - 1), 
                     s2.substring(0, s2.length() - 1));
            else
               displayPermutation(s1 + s2.charAt(i), 
                     s2.substring(0, i) + s2.substring(i + 1, s2.length())); 
         }
      }
   }
}
