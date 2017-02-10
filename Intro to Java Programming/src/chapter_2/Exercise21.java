package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Crude program to calculate investment value after a number of years.
 * @author Kevin
 *
 */
public class Exercise21 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investment = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualRate = input.nextDouble();
		System.out.print("Enter number of years (integer): ");
		int years = input.nextInt();
		
		double futureValue = investment * Math.pow((1 + (annualRate / 1200)), 
				years * 12);
		
		System.out.println("Accumulated value is $" + form.format(futureValue));
		input.close();
	}
}
