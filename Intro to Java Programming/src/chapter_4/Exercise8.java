package chapter_4;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");
		int s = input.nextInt();

		if (s < 0 || s > 127)
			System.out.println("Input must be between 0 and 127.");
		else
			System.out.print("The character for ASCII code " + s + " is "
				+ (char) s);

	}
}