package chapter_18;

import java.util.Scanner;

/** Tower of Hanoi: Number of moves required to move all disks */
public class Exercise18 {
   
   public static int count;
   
   public static void main(String[] args) {
      
      count = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of disks: ");
      int n = input.nextInt();
      
      System.out.println("The moves are: ");
      moveDisks(n, 'A', 'B', 'C');
      System.out.println("Total move count: " + count);
      input.close();
   }
   
   /** The method for finding a solution to the Tower of Hanoi problem */
   public static void moveDisks(int n, char fromTower, char toTower, 
         char auxTower) {
      if (n == 1) {
         System.out.println("Move disk " + n + " from " + fromTower
               + " to " + toTower);
         count++;
      }
      else {
         moveDisks(n - 1, fromTower, auxTower, toTower);
         System.out.println("Move disk " + n + " from " + fromTower
               + " to " + toTower);
         count++;
         moveDisks(n - 1, auxTower, toTower, fromTower);
      }
   }
}
