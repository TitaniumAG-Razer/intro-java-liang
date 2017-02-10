package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Convert square meters into pings.
 * 
 * @author Kevin
 *
 */
public class Exercise4 {
	public static void main(String[] args) {
		DecimalFormat form = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for square meters: ");
		double sqMeters = input.nextDouble();
		double pings = sqMeters * 0.3025;
		
		System.out.println(sqMeters + " square meters is " + 
				form.format(pings) + " pings.");
		
		input.close();	
	}
}
