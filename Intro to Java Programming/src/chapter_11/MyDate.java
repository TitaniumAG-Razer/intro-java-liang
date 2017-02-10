package chapter_11;

import java.util.Calendar;
import java.util.GregorianCalendar;

/** A class that implements the GregorianCalendar to show the current date **/
public class MyDate {

	private int year;
	private int month;		
	private int day;
	
	// Default Constructor = Current Time
	MyDate() {
		GregorianCalendar cal = new GregorianCalendar();
	    year = cal.get(Calendar.YEAR);
	    month = cal.get(Calendar.MONTH);
	    day = cal.get(Calendar.DAY_OF_MONTH);
	}
		
	// Milliseconds since January 1, 1970 Midnight
	MyDate(long elapsedTime) {
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(elapsedTime);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
	}
	
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// Accessors
	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDay() { return day; }

	// Mutator
	public void setDate(long elapsedTime) {
		
		GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
	}
	
	// toString
	public String toString() {

		String returnString = "Year: " + year;
		
		switch(month) {
		case 0: returnString += "\nMonth: JANUARY"; break;
		case 1: returnString += "\nMonth: FEBRUARY"; break;
		case 2: returnString += "\nMonth: MARCH"; break;
		case 3: returnString += "\nMonth: APRIL"; break;
		case 4: returnString += "\nMonth: MAY"; break;
		case 5: returnString += "\nMonth: JUNE"; break;
		case 6: returnString += "\nMonth: JULY"; break;
		case 7: returnString += "\nMonth: AUGUST"; break;
		case 8: returnString += "\nMonth: SEPTEMBER"; break;
		case 9: returnString += "\nMonth: OCTOBER"; break;
		case 10: returnString += "\nMonth: NOVEMBER"; break;
		case 11: returnString += "\nMonth: DECEMBER"; break;
		}
		
		returnString += "\nDay: " + day;
		
		return returnString;
	}
}
