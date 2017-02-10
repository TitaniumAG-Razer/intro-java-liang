package chapter_20;

import java.util.Scanner;
import java.util.Stack;

/** Postfix Notation. Ideally we would use the non-Java API stack, but this
 * will get the job done. */
public class Exercise13 {
   public static void main(String[] args) {
      
      Stack<Double> stack = new Stack<>();
      System.out.println("Enter the postfix notation, with spaces between"
            + " each operator and/or operand:");
      Scanner input = new Scanner(System.in);
      String line = input.nextLine();
      String[] expressions = line.split(" ");
      double value1;
      
      try {
         for (int i = 0; i < expressions.length; i++) {
            if (isNumber(expressions[i]))
               stack.push(Double.parseDouble(expressions[i]));
            else if (expressions[i].equals("+")) {
               if (stack.size() < 2) {
                  System.out.println("Invalid postfix notation");
                  return;
               }
               value1 = stack.pop();
               value1 += stack.pop();
               stack.push(value1);
            }
            else if (expressions[i].equals("-")) {
               if (stack.size() < 2) {
                  System.out.println("Invalid postfix notation");
                  return;
               }
               value1 = stack.pop();
               value1 -= stack.pop();
               stack.push(value1);
            }
            else if (expressions[i].equals("*")) {
               if (stack.size() < 2) {
                  System.out.println("Invalid postfix notation");
                  return;
               }
               value1 = stack.pop();
               value1 *= stack.pop();
               stack.push(value1);
            }
            else if (expressions[i].equals("/")) {
               if (stack.size() < 2) {
                  System.out.println("Invalid postfix notation");
                  return;
               }
               value1 = stack.pop();
               value1 /= stack.pop();
               stack.push(value1);
            }
            else if (expressions[i].equals("%")) {
               if (stack.size() < 2) {
                  System.out.println("Invalid postfix notation");
                  return;
               }
               value1 = stack.pop();
               value1 = stack.pop() % value1;
               stack.push(value1);
            }
            else {
               System.out.println("Invalid postfix notation");
               return;
            }
         }
      }
      catch (NumberFormatException e) {
         System.out.println("Error detected. You likely have non-numeric "
               + "characters embedded in operands.");
         return;
      }

      System.out.println("The value is: " + stack.pop());
      input.close();
   }
   
   public static boolean isNumber(String s) {
      return (s.contains(".") || Character.isDigit(s.charAt(0)));
   }
}
