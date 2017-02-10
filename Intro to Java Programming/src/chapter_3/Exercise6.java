package chapter_3;

/**
 * Revise an earlier problem - allow the user to enter weight and height
 * in feet and inches. Then calculate the BMI and display the BMI class.
 * @author Kevin
 *
 */

import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();
		
		inches += (feet * 12);
		
		double weightInKilograms = pounds * 0.45359237; // kilos per pound
		double heightInMeters = inches * 0.0254; // meters per inch
		double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));
		
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
