package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the distance between 2 points on a coordinate graph.
 * @author Kevin
 *
 */
public class Exercise15 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double calculation = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		System.out.println("The distance between the two points " + 
				form.format(Math.sqrt(calculation)));
		
		input.close();
	}
}
