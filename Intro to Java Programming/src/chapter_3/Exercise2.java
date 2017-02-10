package chapter_3;

import java.util.Scanner;

/**
 * Multiplication Quiz: Generate 3 single digit integers and prompt the user
 * to enter the product.
 * @author Kevin
 *
 */
public class Exercise2 {
	public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis() % 9) + 1;
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 549 % 10);
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " times " +
				number2 + " times " + number3 + "?");
		
		int answer = input.nextInt();
		
		System.out.println(answer == number1 * number2 * number3);
		input.close();
	}
}
