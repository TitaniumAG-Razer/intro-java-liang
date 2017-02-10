package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Compute monthly balances given initial balance and 3.75% annual interest.
 * 
 * @author Kevin
 *
 */
public class Exercise13 {
	public static void main(String[] args) {
		
		// (3.75 / 12)
		final double MONTHLY_INTEREST = 0.003125;
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double principle = input.nextDouble();
		
		// can be done in a loop - will do in another chapter
		double sum = principle * (1 + MONTHLY_INTEREST);
		System.out.println("After the first month, the account value is $" +
				form.format(sum));

		// second month
		sum = (principle + sum) * (1 + MONTHLY_INTEREST);
		System.out.println("After the first month, the account value is $" +
				form.format(sum));
		
		// third month
		sum = (principle + sum) * (1 + MONTHLY_INTEREST);
		System.out.println("After the first month, the account value is $" +
				form.format(sum));
		
		sum = (principle + sum) * (1 + MONTHLY_INTEREST);
		sum = (principle + sum) * (1 + MONTHLY_INTEREST);
		sum = (principle + sum) * (1 + MONTHLY_INTEREST);
		
		System.out.println("The sum after 6 months is: $" + form.format(sum));
		input.close();
	}
}
