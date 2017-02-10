package chapter_2;

import java.util.Scanner;

/**
 * Reads in an integer between 0 and 1000, and multiplies all the digits 
 * in the integer.
 * 
 * @author Kevin
 *
 */
public class Exercise6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = -1;
		
		while (true) {
			System.out.println("Enter an integer between 0 and 1000: ");
			number = input.nextInt();
			
			if (number < 0 || number > 1000)
				System.out.println("Please try again.");
			else
				break;			
		}
		
		int remainder = number % 10;
		int multiplicator = number / 10;
		
		while (multiplicator != 0) {
			remainder *= multiplicator % 10;
			multiplicator = multiplicator / 10;
		}
		
		System.out.println("The multiplication of all digits in " + number + 
				" is " + remainder);
		
		input.close();
	}
}
