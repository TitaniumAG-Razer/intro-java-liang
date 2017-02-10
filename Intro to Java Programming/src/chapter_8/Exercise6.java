package chapter_8;

/** Multiply 2 matrices */
public class Exercise6 {
   public static void main(String[] args) {
      
      // Test multiply 2x2 by 2x2
      double[][] a = {{1, 2}, {3, 4}};
      double[][] b = {{0, 2}, {4, 1}};
      
      displayMatrix(multiplyMatrix(a, b));
      System.out.println("==============================");
      
      // Test multiply 3x3 by 3x3
      double[][] c = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
      double[][] d = {{0, -1, -2}, {4, 5, 6}, {2, 7, 10}};
      
      displayMatrix(multiplyMatrix(c, d));
      System.out.println("==============================");
      
      // Test multiply 2x3 by 3x2
      double[][] e = {{1, 2, 3}, {4, 5, 6}};
      double[][] f = {{7, 8}, {9, 10}, {11, 12}};
      
      displayMatrix(multiplyMatrix(e, f));
      System.out.println("==============================");
      
      // Test multiply 3x2 by 3x2 (Should return error message)
      double[][] x = {{7, 8}, {9, 10}, {11, 12}};
      double[][] y = {{7, 8}, {9, 10}, {11, 12}};
      
      displayMatrix(multiplyMatrix(x, y));
      System.out.println("==============================");
   }
   
   public static double[][] multiplyMatrix(double[][] a, double[][] b) {
      
      int aRows = a.length;
      int aColumns = a[0].length;
      int bRows = b.length;
      int bColumns = b[0].length;

      // Check if # of columns of a matches # of rows of b
      if (aColumns != bRows) {
         System.out.println("First array's number of columns "
               + "must match second array's number of rows.");
         return null;
      }
      
      if (aRows < 1 || bRows < 1 || aColumns < 1 || bColumns < 1) {
         System.out.println("Both arrays must have rows and columns that span"
               + " more than 1 unit.");
         return null;
      }
      
      double[][] c = new double[aRows][bColumns];
      
      for (int i = 0; i < aRows; i++) {
         for (int j = 0; j < bColumns; j++) {
            for (int k = 0; k < aColumns; k++)
               c[i][j] += a[i][k] * b[k][j];
         }
      }
      
      return c;
   }
   
   public static void displayMatrix(double[][] matrix) {
      
      if (matrix == null) {
         System.out.println("Nothing to display.");
         return;
      }
      
      System.out.println("The result is: ");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
         }
            System.out.println();
      }
   }
}
