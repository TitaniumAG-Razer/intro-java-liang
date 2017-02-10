package chapter_18;

import java.text.DecimalFormat;

/** Sum of the series m(i) = 1 + 0.5 + 0.25 + (1 / 2) ^ i... using recursion **/
public class Exercise4 {
   public static void main(String[] args) {

      DecimalFormat form = new DecimalFormat("#.##");

      for (int i = 1; i <= 10; i++)
         System.out.println("m(" + i + ") is " + form.format(sumSeries(i)));
   }

   public static double sumSeries(int i) {

      if (i == 1)
         return 1.0;
      else
         return (1.0 / (2 * (i - 1))) + sumSeries(i - 1);
   }
}
