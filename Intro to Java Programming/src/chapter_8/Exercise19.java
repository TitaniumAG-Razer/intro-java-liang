package chapter_8;
import java.util.*;

public class Exercise19 {

   public static final int DEFAULT_ROWS = 5;
   public static final int DEFAULT_COLUMNS = 5;

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("How many Rows?" );
      int rows = input.nextInt();

      if (rows < 5 || rows > 10)
         rows = DEFAULT_ROWS;

      System.out.println("How many Columns?" );
      int columns = input.nextInt();

      if (columns < 5 || columns > 10)
         columns = DEFAULT_COLUMNS;

      int[][] twoDArray = new int[rows][columns];

      // Instantiate the Array
      for (int i = 0; i < rows; i++) {
         System.out.println("Enter Row's Numbers: ");
         for (int j = 0; j < columns; j++) {
            int getNumber = input.nextInt();
            twoDArray[i][j] = getNumber;
         }
      }

      System.out.println("\nSearching...");
      if (isConsecutiveFour(twoDArray))
         System.out.println("Yes, there are 4 consecutive integers!");
      else
         System.out.println("Nope, didn't find any.");

      input.close();
   }

   public static boolean isConsecutiveFour(int[][] values) {

      // Check contiguous numbers by row
      for (int i = 0; i < values.length; i++) {
         for (int j = 0; j < values[i].length - 3; j++) {

            if ((values[i][j] == values[i][j+1]) && (values[i][j] == values[i][j+2])
                  && (values[i][j] == values[i][j+3]))
               return true;
         }
      }

      // Check contiguous numbers by column
      for (int i = 0; i < values.length - 3; i++) {
         for (int j = 0; j < values[i].length; j++) {

            if ((values[i][j] == values[i+1][j]) && (values[i][j] == values[i+2][j])
                  && (values[i][j] == values[i+3][j]))
               return true;
         }
      }

      // Check contiguous numbers by diagonal (NorthWest to SouthEast)
      for (int i = 0; i < values.length - 3; i++) {
         for (int j = 0; j < values[i].length - 3; j++) {

            if ((values[i][j] == values[i+1][j+1]) && (values[i][j] == values[i+2][j+2])
                  && (values[i][j] == values[i+3][j+3]))
               return true;
         }
      }

      for (int i = values.length - 1; i > 2; i--) {
         for (int j = 0; j < values[i].length - 3; j++) {

            if ((values[i][j] == values[i-1][j+1]) && (values[i][j] == values[i-2][j+2])
                  && (values[i][j] == values[i-3][j+3]))
               return true;
         }
      }

      // We did not find anything
      return false;
   }
}
