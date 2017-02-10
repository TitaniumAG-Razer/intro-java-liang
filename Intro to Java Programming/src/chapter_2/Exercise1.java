package chapter_2;

/**
 * Write a program that reads in miles and changes it to kilometers.
 * 
 * @author Kevin
 *
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise1 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.#");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of miles (Integer): ");
		int miles = input.nextInt();
		
		double kilometers = 1.6 * miles;
		System.out.println(miles + " miles is " + form.format(kilometers) + 
				" kilometers.");
		input.close();
	}
}
