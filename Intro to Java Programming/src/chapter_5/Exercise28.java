package chapter_5;

/**
 * Display the first day of each month in a particular year
 * @author Kevin
 */

import java.util.Scanner;

public class Exercise28 {
	public static void main(String[] args) {

		String sMonth, sDay;

		Scanner input = new Scanner(System.in);
		// Enter loan amount
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter first day of year " + 
				"(1 for Monday, 2 for Tuesday and so on): ");
		int day = input.nextInt();
		// Going through each month
		for (int month = 1; month <= 12; month++) {
			// calculating number of days
			int length = 30 + ((month + (int) (month / 8.0)) % 2);
			if (month == 2) {
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					length = 29;
				} else {
					length = 28;
				}
			}

			// Processing month

			switch (month) {
			case 1:
				sMonth = "January";
				break;
			case 2:
				sMonth = "February";
				break;
			case 3:
				sMonth = "March";
				break;
			case 4:
				sMonth = "April";
				break;
			case 5:
				sMonth = "May";
				break;
			case 6:
				sMonth = "June";
				break;
			case 7:
				sMonth = "July";
				break;
			case 8:
				sMonth = "August";
				break;
			case 9:
				sMonth = "September";
				break;
			case 10:
				sMonth = "October";
				break;
			case 11:
				sMonth = "November";
				break;
			case 12:
				sMonth = "December";
				break;
			default:
				sMonth = "";
			}

			// Calculating day

			day = (day) % 7;

			switch (day) {
			case 1:
				sDay = "Monday";
				break;
			case 2:
				sDay = "Tuesday";
				break;
			case 3:
				sDay = "Wednesday";
				break;
			case 4:
				sDay = "Thursday";
				break;
			case 5:
				sDay = "Friday";
				break;
			case 6:
				sDay = "Saturday";
				break;
			case 0:
				sDay = "Sunday";
				break;
			default:
				sDay = "";
			}

			System.out.println(sMonth + " 1, " + year + " is " + sDay);
			day += length;
		}
	}
}