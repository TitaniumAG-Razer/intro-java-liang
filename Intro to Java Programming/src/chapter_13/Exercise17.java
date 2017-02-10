package chapter_13;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Test the Complex class **/
public class Exercise17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter the first complex number: ");
			double realValue = input.nextDouble();
			double imaginaryValue = input.nextDouble();
			
			Complex firstNum = new Complex(realValue, imaginaryValue);
			
			System.out.print("Enter the first complex number: ");
			realValue = input.nextDouble();
			imaginaryValue = input.nextDouble();
			
			Complex secondNum = new Complex(realValue, imaginaryValue);
			Complex sum = firstNum.add(secondNum);
			Complex diff = firstNum.subtract(secondNum);
			Complex product = firstNum.multiply(secondNum);
			Complex quotient = firstNum.divide(secondNum);
			double abs = firstNum.getAbsValue();
			double abs2 = secondNum.getAbsValue();
			
			System.out.println(firstNum.toString() + " + " + secondNum.toString()
					+ " = " + (sum.toString()));
			System.out.println(firstNum.toString() + " - " + secondNum.toString()
			+ " = " + (diff.toString()));
			System.out.println(firstNum.toString() + " * " + secondNum.toString()
			+ " = " + (product.toString()));
			System.out.println(firstNum.toString() + " / " + secondNum.toString()
			+ " = " + (quotient.toString()));
			System.out.println("First complex's absolute value: " + abs);
			System.out.println("Second complex's absolute value: " + abs2);
			
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid input.");
			return;
		}
	
	}
}
