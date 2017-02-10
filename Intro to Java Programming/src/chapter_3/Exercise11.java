package chapter_3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Display the number of days in a particular month and year. 
 * @author Kevin
 *
 */
public class Exercise11 {
	public static void main(String[] args) {
		
		System.out.println("Please enter the year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.println("Please enter the month as an integer (i.e. January " +
				"is 1, February is 2, etc.): ");
		int month = input.nextInt();
		month--; // for adjustment purposes
		int day = 1; // to use with Gregorian Calendar
		
		Calendar calendar = new GregorianCalendar(year, month, day);
		int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		switch (month) {
		case 0: System.out.println("January " + year + " has " + daysInMonth + 
				" days."); break;
		case 1: System.out.println("February " + year + " has " + daysInMonth + 
				" days."); break;
		case 2: System.out.println("March " + year + " has " + daysInMonth + 
				" days."); break;
		case 3: System.out.println("April " + year + " has " + daysInMonth + 
				" days."); break;
		case 4: System.out.println("May " + year + " has " + daysInMonth + 
				" days."); break;
		case 5: System.out.println("June " + year + " has " + daysInMonth + 
				" days."); break;
		case 6: System.out.println("July " + year + " has " + daysInMonth + 
				" days."); break;
		case 7: System.out.println("August " + year + " has " + daysInMonth + 
				" days."); break;
		case 8: System.out.println("September " + year + " has " + daysInMonth + 
				" days."); break;
		case 9: System.out.println("October " + year + " has " + daysInMonth + 
				" days."); break;
		case 10: System.out.println("November " + year + " has " + daysInMonth + 
				" days."); break;
		case 11: System.out.println("December " + year + " has " + daysInMonth + 
				" days."); break;
		default: System.out.println("You did not enter valid month value!"); break;
		}
		
	}
}
