package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the energy needed to heat water from an initial temperature
 * to the final temperature.
 * @author Kevin
 *
 */
public class Exercise10 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		// Prompt user to enter variables
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of water in kg: ");
		double water = input.nextDouble();
		System.out.println("Enter the initial temperature in C: ");
		double initialTemperature = input.nextDouble();
		System.out.println("Enter the final temperature in C: ");
		double finalTemperature = input.nextDouble();
		
		System.out.println("The amount of energy needed to heat the water is " + 
				form.format(water * (finalTemperature - initialTemperature) * 4184)
		+ " Joules");
		
		input.close();
	}
}
