package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Determine wind chill factor based on temperature (F) and wind speed (mph).
 * @author Kevin
 *
 */
public class Exercise17 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		double temp = input.nextDouble();
		System.out.println("Enter the wind speed: ");
		double speed = input.nextDouble();
		
		double windChillFactor = 35.74 + (0.6215 * temp) - 
				35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
		
		System.out.println("Wind chill factor is " + form.format(windChillFactor));
		input.close();
	}
}
