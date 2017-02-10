package chapter_5;

/**
 * Loan Amortization Program.
 * @author Kevin
 */
import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Number of years: ");
		int years = input.nextInt();

		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();

		System.out.print("Annual interest rate " + 
				"in percent, e.g. 7.0: ");
		double annualRate = input.nextDouble();

		double monthlyRate = annualRate / 1200.0;
		double monthlyPayment = loan * monthlyRate / (1 - 1 /
				Math.pow(1 + monthlyRate, years * 12));
		double totalPayment = monthlyPayment * years * 12;

		System.out.printf("Monthly Payment: " + "\n%.2f", monthlyPayment);
		System.out.printf("\nTotal Payment: " + "\n%.2f\n\n", totalPayment);

		double balance = loan;
		System.out.print("Payment #");
		System.out.print("\tInterest");
		System.out.print("\tPrincipal");
		System.out.print("\tBalance");

		for (int i = 1; i <= years * 12; i++) {

			double interest = monthlyRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("\n" + i + "\t\t%.2f" + 
					"\t\t%.2f" + "\t\t%.2f", interest, principal, balance);
		}
		
		input.close();
	}
}


