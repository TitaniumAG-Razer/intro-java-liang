package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Compute BMI given weight (lb) and height (in)
 * @author Kevin
 *
 */
public class Exercise14 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		
		double kilo = pounds * 0.45359237;
		double meters = 0.0254 * inches;
		
		System.out.println("Your BMI is: " + 
				form.format(kilo / Math.pow(meters, 2)));
		
		input.close();
	}
}
