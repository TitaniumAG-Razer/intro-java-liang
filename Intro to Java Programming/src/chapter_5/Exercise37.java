package chapter_5;

import java.util.Scanner;

/**
 * The program converts a decimal integer to its binary value.
 * @author Kevin
 *
 */

public class Exercise37 {
	public static void main(String[] args) {
		
		System.out.println("Enter a positive integer: ");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int n = 0;
		String binary = "";
		
		while (Math.pow(2, n) < number) {
			n++;
		}
		
		while (n >= 0) {
			if (Math.pow(2, n) > number) {
				binary += "0";
				n--;
			}
			else {
				binary += "1";
				number -= Math.pow(2, n);
				n--;
			}			
		}
		
		System.out.println("The binary value for that integer is " + binary);
		input.close();
	}
}
