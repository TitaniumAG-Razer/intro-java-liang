package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate cost of driving based on MPG, PPG, and distance driven.
 * @author Kevin
 *
 */
public class Exercise23 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter driving distance: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double ppg = input.nextDouble();
		
		System.out.println("The cost of driving is $" + 
				form.format((distance / mpg * ppg)));
		
		input.close();
	}
}
