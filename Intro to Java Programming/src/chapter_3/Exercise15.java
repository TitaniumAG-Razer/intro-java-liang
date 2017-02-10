package chapter_3;

import java.util.Scanner;

/** 
 * Lottery Problem.
 * @author Kevin
 *
 */
public class Exercise15 {
	public static void main(String[] args) {

		int lottery = (int)(Math.random() * 900) + 100;
		
		// Use code below to verify
		/* System.out.println(lottery) */
		
		System.out.println("Guess the lottery number (100 - 999): ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();

		int lotteryFirstDigit = lottery / 100;
		int lotterySecondDigit = (lottery - (lotteryFirstDigit * 100)) / 10;
		int lotteryThirdDigit = lottery % 10;
		
		int guessFirstDigit = guess / 100;
		int guessSecondDigit = (guess - (guessFirstDigit * 100)) / 10;
		int guessThirdDigit = guess % 10;
		

		if (guess == lottery)
			System.out.println("Congratulations! You've matched all " 
					+ "digits in exact order: you win $12,000");
		else if ((guessFirstDigit == lotterySecondDigit && guessSecondDigit == lotteryFirstDigit && guessThirdDigit == lotteryThirdDigit)
				|| (guessFirstDigit == lotterySecondDigit
				&& guessSecondDigit == lotteryThirdDigit && guessThirdDigit == lotteryFirstDigit)
				|| (guessFirstDigit == lotteryThirdDigit
				&& guessSecondDigit == lotteryFirstDigit && guessThirdDigit == lotterySecondDigit)
				|| (guessFirstDigit == lotteryThirdDigit
				&& guessSecondDigit == lotterySecondDigit && guessThirdDigit == lotteryFirstDigit)
				|| (guessFirstDigit == lotteryFirstDigit
				&& guessSecondDigit == lotteryThirdDigit && guessThirdDigit == lotterySecondDigit))
			System.out.println("You've matched all digits in different order: you win $3,000");
		else if (guessFirstDigit == lotteryFirstDigit || guessFirstDigit == lotterySecondDigit
				|| guessFirstDigit == lotteryThirdDigit || guessSecondDigit == lotteryFirstDigit
				|| guessSecondDigit == lotterySecondDigit || guessSecondDigit == lotteryThirdDigit
				|| guessThirdDigit == lotteryFirstDigit || guessThirdDigit == lotterySecondDigit
				|| guessThirdDigit == lotteryThirdDigit)
			System.out.println("You've matched one digit: you win $1,000.");
		else
			System.out.println("Sorry, no match!");
		
		input.close();
	}
}

