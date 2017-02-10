package chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate gratuity and total bill based on subtotal and 
 * gratuity rate.
 * 
 * @author Kevin
 *
 */

public class Exercise5 {
	public static void main(String[] args) {
		DecimalFormat form = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		double gratuity = (gratuityRate / 100) * subtotal;
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + form.format(gratuity) + 
				" and the total is $" + form.format(total));
		
		input.close();
	}
}
