package chapter_5;

import java.util.Scanner;

/**
 * Display a pyramid based on user input.
 * @author Kevin
 *
 */
public class Exercise17 {
	public static void main(String[] args) {
		
		System.out.print("Enter the number of lines (0-15): ");
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt();
		
		for (int i = lines; i >= 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
