package chapter_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Explore a matrix and find if there are any rows, columns, and diagonals all
 * filled with 0's and 1's.
 */
public class Exercise14 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int size;
      int[][] matrix;

      while (true) {
         try {
            System.out.print("Enter the size for the matrix: ");
            size = input.nextInt();

            if (size < 2 || size > 10) {
               System.out.println("Please enter a size between 2 and 10.");
               continue;
            }

            matrix = new int[size][size];
            fillRandomNumbers(matrix);
            printMatrix(matrix);
            System.out.println();
            verifyConsecutiveNumbers(matrix);

            input.close();
            break;
         } catch (InputMismatchException e) {
            System.out.println("You did not input an integer.");
            input.nextLine();
         }
      }
   }

   public static void verifyConsecutiveNumbers(int[][] a) {

      // Check all rows
      boolean matching = true;;
      int rowsMatching = 0;
      int columnsMatching = 0;
      int majorDiagonalMatching = 0;
      int value;

      for (int i = 0; i < a.length; i++) {
         matching = true;
         value = a[i][0];
         for (int j = 1; j < a[0].length; j++) {
            if (value != a[i][j]) {
               matching = false;
               continue;
            }
         }

         if (matching == true) {
            System.out.println("All " + value + "'s" + " on row " + i);
            rowsMatching++;
         }
      }

      if (rowsMatching == 0)
         System.out.println("No same numbers on any row.");

      // Check all columns
      for (int i = 0; i < a[0].length; i++) {
         matching = true;
         value = a[0][i];
         for (int j = 1; j < a.length; j++) {
            if (value != a[j][i]) {
               matching = false;
               continue;
            }
         }

         if (matching == true) {
            System.out.println("All " + value + "'s" + " on column " + i);
            columnsMatching++;
         }
      }

      if (columnsMatching == 0)
         System.out.println("No same numbers on any column.");

      // Check Major Diagonal
      matching = true;
      value = a[0][0];

      for (int i = 1; i < a.length; i++) {
         if (value != a[i][i]) {
            matching = false;
            continue;
         }
      }

      if (matching == true) {
         System.out.println("All " + value + "'s" + " on the major diagonal.");
         majorDiagonalMatching++;
      }

      if (majorDiagonalMatching == 0)
         System.out.println("No same numbers on the major diagonal.");

      // Check Minor Diagonal
   }

   /** Fill up a 2D array with 0's and 1's */
   public static void fillRandomNumbers(int[][] a) {
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++)
            a[i][j] = (int) (Math.random() * 2);
      }
   }

   /** Print the matrix */
   public static void printMatrix(int[][] a) {
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++)
            System.out.print(a[i][j] + " ");
         System.out.println();
      }
      System.out.println();
   }
}