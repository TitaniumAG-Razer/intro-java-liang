package chapter_8;

/** This program tests the sumRow method, which adds up all the elements
in a particular row of a 2-D array.*/
public class Exercise1 {
   public static void main(String[] args) {
      
      double[][] array = new double[2][2];
      
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++)
            array[i][j] = Math.random() * 10;
      }
      
      try {
         System.out.println("Sum of Row 0: " + sumRow(array, 0));
         System.out.println("Sum of Row 1: " + sumRow(array, 1));
         System.out.println("Sum of Row 4: " + sumRow(array, 4));
      } 
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Row out of bounds.");
      }
   }
   
   /** Sums row in 2-D array m */
   public static double sumRow(double[][] m, int rowIndex) {
      
      if (rowIndex < 0 || rowIndex >= m.length)
         throw new ArrayIndexOutOfBoundsException();
      
      double sum = 0.0;
      
      for (int i = 0; i < m[rowIndex].length; i++)
         sum+= m[rowIndex][i];
      
      return sum;
   }
}
