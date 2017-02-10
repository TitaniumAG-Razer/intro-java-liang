package chapter_2;

import java.util.Scanner;
import java.text.*;

/**
 * Compute area of an equilateral triangle and the volume of its 
 * corresponding prism.
 * 
 * @author Kevin
 *
 */

public class Exercise2 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the sides of the equilateral " +
				"triangle: ");
		double length = input.nextDouble();
		double area = (Math.sqrt(3.0)) * (Math.pow(length, 2)) / 4.0;
		double volume = area * length;
		
		System.out.println("Area is " + form.format(area));
		System.out.println("Volume is " + form.format(volume));
		
		input.close();
	}
}
