package chapter_18;

/** Compute the series of (1/3) + (2/4) + ... i / (i + 2) **/
public class Exercise6 {
   public static void main(String[] args) {

      for (int i = 1; i <= 10; i++) {
         System.out.println("m(" + i + ") is " + sumSeries(i));
      }
   }

   public static double sumSeries(int i) {

      if (i == 1)
         return (1.0 / 3);
      else
         return (i * 1.0) / (i + 2) + sumSeries(i - 1);
   }
}
