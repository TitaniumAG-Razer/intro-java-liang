package chapter_6;

/** Display the first 100 pentagonal numbers */
public class Exercise1 {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 100; i++) {
         System.out.print(getPentagonalNumber(i) + " ");
         if (i % 12 == 0)
            System.out.println();     
      }
   }
   
   public static int getPentagonalNumber(int n) {
      return n * (3 * n - 1) / 2;
   }
}
