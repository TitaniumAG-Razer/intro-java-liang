package chapter_5;

import java.util.Scanner;

/**
 * Compute the monthly payment and TOTAL payment of a loan based
 * on number of years. Display a table of interest rates.
 * 
 * @author Kevin
 *
 */
public class Exercise21 {
	public static void main(String[] args) {


		System.out.print("Loan Amount? ");
		Scanner input = new Scanner(System.in);
		int loanAmount = input.nextInt();

		System.out.print("Number of Years? ");
		int years = input.nextInt();

		// Enter yearly interest rate start value
		double annualInterestRate = 5.0;

		// Printing table header
		System.out.printf("%-18s%-18s%-18s\n", "Interest Rate",
				"Monthly Payment", "Total Payment");

		while (annualInterestRate <= 10.0) {
			// Obtain monthly interest rate
			double monthlyInterestRate = annualInterestRate / 1200;

			// Calculate payment
			double monthlyPayment = loanAmount
					* monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate,
							years * 12));
			double totalPayment = monthlyPayment * years * 12;

			// Display results
			System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate,
					monthlyPayment, totalPayment);

			annualInterestRate = annualInterestRate + 1.0 / 8;

		}
		
		input.close();
	}
}

