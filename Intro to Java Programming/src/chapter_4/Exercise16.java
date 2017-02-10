package chapter_4;

/** Write a program that displays a random lowercase letter
 * using the Math.random() method. */
public class Exercise16 {
   public static void main(String[] args) {
      
      int a = (int)'a';
      int z = (int)'z';
      
      char randomLetter = (char)((int)(Math.random() * (z - a)) + a);
      System.out.println(randomLetter);
   }
}
