package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the area of a triangle based on 3 coordinate points.
 * 
 * @author Kevin
 *
 */
public class Exercise19 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 points for the triangle: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double calculation = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double side1 = Math.sqrt(calculation);
		
		calculation = Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2);
		double side2 = Math.sqrt(calculation);
		
		calculation = Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2);
		double side3 = Math.sqrt(calculation);
		
		double s = (side1 + side2 + side3) / 2.0;
		
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.println("The area of the triangle is " + form.format(area));
		input.close();
	}
}
