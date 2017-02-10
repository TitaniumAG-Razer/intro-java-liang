package chapter_9;

import java.util.GregorianCalendar;

/**
 * Test out the GregorianCalendar class.
 * @author Kevin
 */

public class Exercise5 {
	public static void main(String[] args) {
		
		GregorianCalendar testCalendar = new GregorianCalendar();
		
		// Convert month integer to actual name of month
		String[] months = {"January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };
		
		// Get current date
		int month = testCalendar.get(GregorianCalendar.MONTH);
		System.out.println(months[month] + " " + 
				testCalendar.get(GregorianCalendar.DAY_OF_MONTH) 
				+ ", " + testCalendar.get(GregorianCalendar.YEAR));
		
		// What is the date when 123456789865 milliseconds have elapsed?
		testCalendar.setTimeInMillis(123456789865L);
		month = testCalendar.get(GregorianCalendar.MONTH);
		System.out.println(months[month] + " " + 
				testCalendar.get(GregorianCalendar.DAY_OF_MONTH) 
				+ ", " + testCalendar.get(GregorianCalendar.YEAR));
	}
}

