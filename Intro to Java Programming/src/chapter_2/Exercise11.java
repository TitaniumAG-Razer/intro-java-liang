package chapter_2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Prompt user to enter the number of years, and display USA population
 * after set number of years. Assume current population is 312,032,486. 
 * There is 1 birth every 7 seconds, 1 death every 13 seconds, and 1 immigrant 
 * every 45 seconds.
 * 
 * @author Kevin
 *
 */
public class Exercise11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		// Calculate births, deaths, and immigrants per year
		double annualBirths = (365.0 * 24 * 60 * 60) / 7;
		
		double annualDeaths = (365.0 * 24 * 60 * 60) / 13;
		
		double annualImmigrants = (365.0 * 24 * 60 * 60) / 45;
		
		// Get population after certain number of years
		int currentPopulation = 312032486 + (int)(years * (annualBirths - annualDeaths 
				+ annualImmigrants));
			
		System.out.println("The population in " + years + " years is " + 
				(NumberFormat.getNumberInstance(Locale.US).format(currentPopulation)));
		input.close();
		
	}
}
