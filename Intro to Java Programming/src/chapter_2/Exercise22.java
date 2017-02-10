package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program computes the value of an arithmetic series.
 * @author Kevin
 *
 */
public class Exercise22 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.#");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial value: ");
		int value = input.nextInt();
		System.out.println("Enter difference between each term and its next: ");
		int diff = input.nextInt();
		System.out.println("Enter number of terms: ");
		int number = input.nextInt();
		
		int finalValue = value + (number - 1) * diff;
		
		double series = (number * (value + finalValue) / 2.0);
		System.out.println("The sum of the series is " + form.format(series));
		
		input.close();
	}
}
