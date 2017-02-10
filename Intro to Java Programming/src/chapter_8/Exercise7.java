package chapter_8;

/** Find points closest to each other in a 3D plane */
public class Exercise7 {
   public static void main(String[] args) {

      double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
            {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
            {5.5, 4, -0.5}};

      displayPoints(findClosestPoints3D(points));
   }

   public static double[][] findClosestPoints3D(double[][] matrix) {

      if (matrix.length < 2 || matrix[0].length != 3) {
         System.out.println("Invalid format: Please provide a 2D array"
               + " containing at least 2 points in a 3D plane.");
         return null;
      }

      // Initialize points to the first two points in 
      // the 2D array, and set minimum distance to a large number
      int pointA = 0;
      int pointB = 0;

      double minDistance = 5000000.0;
      double distance;

      // Iterate through every pair of points in the 2D array
      for (int i = 0; i < matrix.length - 1; i++) {
         for (int j = i + 1; j < matrix.length; j++) {
            distance = Math.sqrt(Math.pow(matrix[j][0] - matrix[i][0], 2) +
                  Math.pow(matrix[j][1] - matrix[i][1], 2) + 
                  Math.pow(matrix[j][2] - matrix[i][2], 2));

            if (distance < minDistance) {
               minDistance = distance;
               pointA = i;
               pointB = j;
            }     
         }
      }

      double[][] shortestDistancePoints = {
            {matrix[pointA][0], matrix[pointA][1], matrix[pointA][2]},
            {matrix[pointB][0], matrix[pointB][1], matrix[pointB][2]}};

      return shortestDistancePoints;
   }
   
   public static void displayPoints(double[][] a) {
      if (a.length != 2 || a[0].length != 3) {
         System.out.println("Invalid format; nothing to display."); 
         return;
      }
      
      System.out.println("Point 1: " + a[0][0] + " " + a[0][1] + " " + a[0][2]);
      System.out.println("Point 2: " + a[1][0] + " " + a[1][1] + " " + a[1][2]);
   }
}
