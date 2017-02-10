package chapter_3;

import java.util.Scanner;

/**
 * Check if a 3 digit integer is a Palindrome.
 * @author Kevin
 *
 */

public class Exercise12 {
	public static void main(String[] args) {
		System.out.println("Enter a 3 digit integer: ");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		if (userInput % 10 == userInput / 100)
			System.out.println(userInput + " is a Palindrome.");
		else
			System.out.println(userInput + " is not a Palindrome.");
		
		input.close();
	}
}
