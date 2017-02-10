package chapter_3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Solve quadratic equations given a, b, and c (use Quadratic Formula)
 * @author Kevin
 *
 */
public class Exercise1 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		if (discriminant < 0.0)
			System.out.println("Equation has no real roots");
		else if (discriminant == 0.0) {
			double root = (-1.0 * b) / (2 * a);
			System.out.println("The equation has one root: " + form.format(root));
		}
		else {
			double root1 = ((-1.0 * b) + Math.sqrt(discriminant)) / (2 * a);
			double root2 = ((-1.0 * b) - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The equation has two roots: " 
					+ form.format(root1) + " and " + form.format(root2));
		}
		
		input.close();
	}
}
