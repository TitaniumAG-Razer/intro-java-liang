package chapter_18;

/** Sum of a series m(i) = (2/3) + (4/5) + (6/7) + (8/9) + ... **/
public class Exercise5 {
   public static void main(String[] args) {

      for (int i = 1; i <= 10; i++) {
         System.out.println("m(" + i + ") is " + sumSeries(i));
      }
   }

   public static double sumSeries(int i) {

      if (i == 1)
         return (2.0 / 3);
      else
         return (2.0 * i / ((2 * i) + 1)) + sumSeries(i - 1);
   }
}
