package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Convert user's input from meters to feet.
 * @author Kevin
 *
 */
public class Exercise3 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for meters: ");
		double meters = input.nextDouble();
		double feet = meters * 3.2786;
		
		System.out.println(meters + " meters is " + form.format(feet) + " feet.");
		
		input.close();
	}
}
