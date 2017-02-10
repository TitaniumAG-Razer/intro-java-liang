package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the area of a hexagon.
 * @author Kevin
 *
 */
public class Exercise16 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the hexagon's side length: ");
		double side = input.nextDouble();
		
		double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
		
		System.out.println("Area of the hexagon is " + form.format(area));
		
		input.close();
	}
}
