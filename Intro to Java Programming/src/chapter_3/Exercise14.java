package chapter_3;

import java.util.Scanner;

/**
 * Game of Heads or Tails.
 * @author Kevin
 *
 */
public class Exercise14 {
	public static void main(String[] args) {
		int coin = (int)(Math.random() * 2);
		
		System.out.println("0 - Tails, 1 - Heads");
		System.out.println("What is your guess? Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		if (! (guess == 1 || guess == 0) )
			System.out.println("You did not enter a valid guess!");
		else if (guess == coin)
			System.out.println("Yes, that's correct!");
		else
			System.out.println("Sorry, that was incorrect.");
	}
}
