package chapter_20;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/** Basic stack operation user interface using Java API Stack */
public class Exercise21 {
   public static void main(String[] args) {
      
      Stack<String> stack = new Stack<>();
      Scanner scanner = new Scanner(System.in);
      int input = 0;
      String string = "";
      
      while (input != 4) {
         try {
            System.out.println("\nStack Operation Menu");
            System.out.println("----------------------------");
            System.out.println(" 1. Insert");
            System.out.println(" 2. Delete");
            System.out.println(" 3. Display");
            System.out.println(" 4. Quit");
            System.out.print("\nPlease input your choice: ");
            
            input = scanner.nextInt();
            
            if (input == 1) {
               System.out.print("Input a string: ");
               scanner.nextLine();
               string = scanner.nextLine();
               stack.push(string);
            }
            else if (input == 2) {
               if (stack.isEmpty()) {
                  System.out.println("Stack is empty.");
                  continue;
               }
               string = stack.pop();
               System.out.println(string + " is deleted.");
            }
            else if (input == 3) 
               System.out.println(stack);
            else if (input == 4)
               System.out.println("Good bye.");
            else
               continue;
         }
         catch (InputMismatchException e) {
            System.out.println("You did not input a number!");
            scanner.nextLine();
            continue;
         }
         catch (OutOfMemoryError ex) {
            ex.printStackTrace();
         }
      }
   }
}
