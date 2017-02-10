package chapter_5;

import java.util.Scanner;

/**
 * This program converts a decimal integer to its corresponding octal value.
 * @author Kevin
 *
 */
public class Exercise38 {
	public static void main(String[] args) {

		System.out.println("Enter a positive integer: ");
		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		int n = 0;
		String octal = "";

		while (Math.pow(8, n) < number) {
			n++;
		}

		while (n >= 0) {
			if (Math.pow(8, n) > number) {
				octal += "0";
				n--;
			}
			else {
				int j = (int) (number / Math.pow(8, n));
				octal += j;
				number -= j * Math.pow(8, n);
				n--;
			}			
		}

		System.out.println("The octal value for that integer is " + octal);
		input.close();
	}
}
