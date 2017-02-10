package chapter_2;

import java.util.Scanner;

/**
 * Find the number of years and days based on user input in minutes.
 * 
 * @author Kevin
 *
 */
public class Exercise7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();

		int years = minutes / (60 * 24 * 365);
		int minutesRemaining = minutes % (60 * 24 * 365);
		int days = minutesRemaining / (60 * 24);
		
		System.out.println(minutes + " minutes is approximately " + 
				years + " years and " + days + " days.");
		
		input.close();
	}
}
