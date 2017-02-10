package chapter_1;

import java.text.DecimalFormat;

/** (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 
 *   40 minutes, and 35 seconds. Write a program that displays the average speed 
 *   in kilometers per hour. (Note that 1 mile is 1.6 kilometers)
 * 
 *  @author Kevin
 */

public class Exercise12 {
	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#.##");
		int hours = 1;
      int minutes = 40;
      int seconds = 35;
      int distanceInMiles = 24;

      // Converting from miles to kilometers
      double distanceInKilometers = 1.0 * distanceInMiles * 1.6;

      // Converting current time (hour, minutes, seconds) into total amount of minutes
      double timeInMinutes = 1.0 * hours * 60.0 + 1.0 * minutes + 1.0 * seconds / 60.0;

      // Calculating kilometers per hour
      // kph = 60 * distance traveled / minutes taken
      double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

      System.out.println(formatter.format(kilometersPerHour));
	}
}
