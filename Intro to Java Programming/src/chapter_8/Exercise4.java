package chapter_8;
import java.util.Scanner;

public class Exercise4 {
   public static void main(String[] args) {

      int[][] overTime = new int[8][7];
      int[][] sum = new int[8][2];

      java.util.Scanner input = new Scanner(System.in);

      for (int i = 0; i < overTime.length; i++) {
         System.out.println("Enter over time of employee " + i + ": ");
         for (int j = 0; j < overTime[0].length; j++) {
            overTime[i][j] = input.nextInt();
         }

      }

      // sum loop
      for (int i = 0; i < overTime.length; i++) {
         for (int j = 0; j < overTime[0].length; j++) {
            sum[i][1] += overTime[i][j];
         }
         sum[i][0] = i;
      }

      selectionSort(sum);

      // printing

      // printing out result

      for (int j = sum.length - 1; j >= 0; j--) {
         System.out.println("Employee " + sum[j][0] + "'s overtime is " + sum[j][1]);
      }

      input.close();
   }

   public static void selectionSort(int[][] list) {
      for (int i = 0; i < list.length - 1; i++) {
         // Find the minimum in the list[i..list.length-1]
         int currentMin = list[i][1];
         int currentMinIndex = i;

         for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j][1]) {
               currentMin = list[j][1];
               currentMinIndex = j;
            }
         }

         // Swap list[i] with list[currentMinIndex] if necessary
         if (currentMinIndex != i) {
            list[currentMinIndex][1] = list[i][1];
            list[i][1] = currentMin;
            list[currentMinIndex][0] = list[i][0];
            list[i][0] = currentMinIndex;

         }
      }
   }

}
