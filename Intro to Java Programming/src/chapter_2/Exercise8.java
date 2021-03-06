package chapter_2;

/**
 * Prompt user to enter the time zone offset to GMT 
 * and display the time in the specified time zone.
 * 
 * @author Kevin
 *
 */

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		
		// GMT offset
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
			
		// Change offset from hours to seconds
		offset *= offset * 60 * 60;
		
		// Obtain number of ms since Jan 1, 1970 midnight
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain number of seconds since Jan 1, 1970
		long totalSeconds = (totalMilliseconds / 1000) + offset;
		
		// Compute current second in the minute of the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain total number of minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute current minute
		long currentMinute = totalMinutes % 60;
		
		// Obtain total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		System.out.println("Current time is " + (currentHour % 24) + 
				":" + currentMinute + ":" + currentSecond + " GMT");
		input.close();
	}
}
