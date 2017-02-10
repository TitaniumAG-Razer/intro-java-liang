package chapter_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Get the average of the major 2D array diagonal */
public class Exercise2 {

   public static double averageMajorDiagonal(double[][] matrix) {

      if (matrix.length != matrix[0].length) {
         System.out.println("2D array must have same number of rows & columns.");
         return 0.0;
      }

      double sum = 0.0;

      for (int i = 0; i < matrix.length; i++) {
         sum += matrix[i][i];
      }

      return sum / matrix.length;
   }

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      double[][] array; 

      while (true) {

         array = new double[4][4];

         try {
            System.out.println("Enter a 4-by-4 matrix one by one: ");
            for (int i = 0; i < 4; i++) {
               for (int j = 0; j < 4; j++) 
                  array[i][j] = input.nextDouble();
            }

            System.out.println("Average of the elements in the major diagonal: ");
            System.out.print(averageMajorDiagonal(array));
            input.close();
            break;
         }

         catch (InputMismatchException e) {
            System.out.println("You did not enter numbers!");
            input.nextLine();
         }

      }
   }
}
