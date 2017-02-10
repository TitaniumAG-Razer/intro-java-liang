package chapter_1;

import java.text.DecimalFormat;

/**
 * Use Cramer's rule to solve an equation.
 * 
 * @author Kevin
 *
 */
public class Exercise13 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.#");
		System.out.println("Using Cramer's Rule to solve: ");
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + 0.55y = 5.9");
		
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;

		System.out.println("X equals " + form.format(((e*d) - (b*f)) / ((a*d) - (b*c))));
		System.out.println("Y equals " + form.format(((a*f) - (e*c)) / ((a*d) - (b*c))));
	}
}
