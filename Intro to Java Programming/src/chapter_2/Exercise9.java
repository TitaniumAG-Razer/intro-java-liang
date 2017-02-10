package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Prompt user to enter initial velocity, ending velocity, and time elapsed.
 * Display the acceleration.
 * 
 * @author Kevin
 *
 */
public class Exercise9 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		// Prompt user to enter all 3 variables
		Scanner input = new Scanner(System.in);
		System.out.println("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double time = input.nextDouble();
		
		System.out.println("The average acceleration is: " + 
				form.format((v1 - v0) / time));
		
		input.close();
	}
}
