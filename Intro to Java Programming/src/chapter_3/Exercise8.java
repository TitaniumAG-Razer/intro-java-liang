package chapter_3;

import java.util.Scanner;

/**
 * Prompt the user to enter 3 integers, and sort them in decreasing order.
 * @author Kevin
 *
 */

public class Exercise8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 3 integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int max = Math.max(Math.max(number1, number2), Math.max(number2, number3));
		int min = Math.min(Math.min(number1, number2), Math.min(number2, number3));
		
		int mid = number1;
		if (number2 < max && number2 > min)
			mid = number2;
		
		if (number3 < max && number3 > min)
			mid = number3;
		
		System.out.println(max + " " + mid + " " + min);
	}
}
