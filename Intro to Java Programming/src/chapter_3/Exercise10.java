package chapter_3;

import java.util.Scanner;

/**
 * Multiplication Quiz
 * @author Kevin
 *
 */

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 1000);
		int number2 = (int)(Math.random() * 1000);
		
		System.out.println("What is " + number1 + " times " +
				number2 + "?" );
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (answer == number1 * number2)
			System.out.println("Correct!");
		else
			System.out.println("Incorrect. The answer is " + number1 * number2);
		
		input.close();
	}
}
