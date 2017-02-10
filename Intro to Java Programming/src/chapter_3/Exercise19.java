package chapter_3;

/**
 * Find the perimeter of a triangle, checking to see if the sides are legitimate.
 * @author Kevin
 */

import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
		System.out.println("Please enter the 3 side lengths of a triangle: ");
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (side1 <= 0 || side2 <= 0 || side3 <= 0)
			System.out.println("Invalid input.");
		else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
			System.out.println("These lengths do not constitute a triangle.");
		else
			System.out.print("The perimeter is ");
			System.out.println(side1 + side2 + side3);
	}
}
