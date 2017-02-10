package chapter_3;

/**
 * Ask user to enter today's day of the week, and how many days have elapsed
 * since that day. Display the current day as well as the future day of the week
 * as the output.
 * @author Kevin
 *
 */

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day (0 for Sunday, 1 for Monday, etc.): ");
		int currentDay = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		daysElapsed = (daysElapsed + currentDay) % 7;
		
		switch (currentDay) {
		case 1: System.out.print("Today is Monday "); break;
		case 2: System.out.print("Today is Tuesday "); break;
		case 3: System.out.print("Today is Wednesday "); break;
		case 4: System.out.print("Today is Thursday "); break;
		case 5: System.out.print("Today is Friday "); break;
		case 6: System.out.print("Today is Saturday "); break;
		case 0: System.out.print("Today is Sunday "); break;
		default: System.out.print("Today is Monday "); break;
		}
		
		switch (daysElapsed) {
		case 1: System.out.print("and the future day is Monday."); break;
		case 2: System.out.print("and the future day is Tuesday "); break;
		case 3: System.out.print("and the future day is Wednesday "); break;
		case 4: System.out.print("and the future day is Thursday "); break;
		case 5: System.out.print("and the future day is Friday "); break;
		case 6: System.out.print("and the future day is Saturday "); break;
		case 0: System.out.print("and the future day is Sunday "); break;
		default: System.out.print("and the future day is Monday "); break;
		}
	}
}
