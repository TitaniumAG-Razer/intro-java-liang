package chapter_3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Simpler implementation of Cramer's rule. Ask user to enter
 * a, b, c, d, e, and f, and display the result. If ad - bc = 0,
 * report "No solution."
 * @author Kevin
 *
 */
public class Exercise3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.#");
		System.out.println("Enter a, b, c, d, e, f: ");
		double a, b, c, d, e, f;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
			
		if (a * d - b * c == 0.0)
			System.out.println("There is no solution.");
		else {
			System.out.println("X equals " + form.format(((e*d) - (b*f)) / ((a*d) - (b*c))));
			System.out.println("Y equals " + form.format(((a*f) - (e*c)) / ((a*d) - (b*c))));
		}
		
		input.close();
	}
}
