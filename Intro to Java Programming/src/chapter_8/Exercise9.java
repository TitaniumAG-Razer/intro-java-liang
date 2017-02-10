package chapter_8;

/** A Tic Tac Toe Game that incorporates error checking and uses a 2D array
 * to print out the values. */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise9 {
   public static void main(String[] args) {

      String[][] board = new String[3][3]; // Tic-Tac-Toe board
      initializeBoard(board);

      String x = " X ";
      String o = " O ";
      int xCount = 0; // Number of X's
      int oCount = 0; // Number of O's
      Scanner input = new Scanner(System.in);
      int row, column;

      boolean ended = false;

      drawBoard(board);

      while (!ended) {
         while (true) {
            try {
               System.out.print("Enter a row (0, 1, 2) for player X: ");
               row = input.nextInt();
               System.out.print("Enter a column (0, 1, 2) for player X: ");
               column = input.nextInt();

               // Bad input
               if (row < 0 || row > 2 || column < 0 || column > 2) 
                  System.out.println("You did not input a valid number!");
               else if (!board[row][column].equals("   ")) // Not empty space
                  System.out.println("That slot is filled already!");
               else {
                  board[row][column] = x;
                  xCount++;
                  break;
               }
            }
            catch (InputMismatchException e) {
               System.out.println("You did not enter a number!");
               input.nextLine();
            }
         }

         // Draw the board
         drawBoard(board);

         // Check if draw or X player wins after move
         if (xCount + oCount > 4)
            if (checkVictoryCondition(board)) {
               System.out.println("X player wins the game.");
               input.close();
               break;
            }
            else if (xCount + oCount == 9) {
               System.out.println("Draw");
               input.close();
               break;
            }

         while (true) {
            try {

               System.out.print("Enter a row (0, 1, 2) for player O: ");
               row = input.nextInt();
               System.out.print("Enter a column (0, 1, 2) for player O: ");
               column = input.nextInt();

               // Bad input
               if (row < 0 || row > 2 || column < 0 || column > 2) 
                  System.out.println("You did not input a valid number!");
               else if (!board[row][column].equals("   ")) // Not empty space
                  System.out.println("That slot is filled already!");
               else {
                  board[row][column] = o;
                  oCount++;
                  break;
               }
            }
            catch (InputMismatchException e) {
               System.out.println("You did not enter a number!");
               input.nextLine();
            }
         }


         drawBoard(board);

         if (xCount + oCount > 4)
            if (checkVictoryCondition(board)) {
               System.out.println("O player wins the game.");
               input.close();
               break;
            }
            else if (xCount + oCount == 9) {
               System.out.println("Draw");
               input.close();
               break;
            }
      }
   }


   // Helper method
   private static void initializeBoard(String[][] board) {
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[0].length; j++)
            board[i][j] = "   ";
      }
   }

   public static void drawBoard(String[][] board) {

      for (int i = 0; i < board.length; i++) {
         System.out.println("-------------");
         for (int j = 0; j < board[0].length; j++) 
            System.out.print("|" + board[i][j]);
         System.out.println("|");
      }
      System.out.println("-------------");
   }

   public static boolean checkVictoryCondition(String[][] board) {

      // Check every row
      if (board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) &&
            !board[0][0].equals("   "))
         return true;

      if (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) &&
            !board[1][0].equals("   "))
         return true;

      if (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) &&
            !board[2][0].equals("   "))
         return true;

      // Check every column
      if (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) &&
            !board[0][0].equals("   "))
         return true;

      if (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) &&
            !board[0][1].equals("   "))
         return true;

      if (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) &&
            !board[0][2].equals("   "))
         return true;

      // Check 2 diagonals
      if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) &&
            !board[0][0].equals("   "))
         return true;

      if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) &&
            !board[0][2].equals("   "))
         return true;

      // No victory conditions met
      return false;
   }
}
