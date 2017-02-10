package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/** This program prompts the user to enter the file, reads the scores from
 * the file, and then displays their total and average.
 * @author Kevin
 *
 */
public class Exercise14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text file: ");
		String name = input.next();
		
		File file = new File(name);
		
		if (!file.exists()) {
			System.out.println("This file does not exist.");
			input.close();
			return;
		}
		
		double total = 0;
		double average = 0;
		int count = 0;
		
		try {
			input = new Scanner(file);

			while (input.hasNextLine()) {
				total += input.nextDouble();
				count++;
			}
			
			average = total / count;
			System.out.println("Total score: " + total);
			System.out.println("Average score: " + average);
		}
		catch (FileNotFoundException ex) {
			System.out.println("File does not exist.");
		}
		catch (InputMismatchException e) {
			System.out.println("One or more input data are not numbers.");
		}
	}
}
