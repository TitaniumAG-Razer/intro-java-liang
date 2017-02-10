package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the interest earned for the next month.
 * 
 * @author Kevin
 *
 */

public class Exercise20 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate: ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double nextMonthInterest = balance * (annualInterestRate / 1200);
		
		System.out.println("Next month interest is $" + 
				form.format(nextMonthInterest));
		input.close();
	}
}
