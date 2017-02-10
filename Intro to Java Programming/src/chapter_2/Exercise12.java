package chapter_2;

import java.util.Scanner;

/**
 * Compute arithmetic progression of a sequence at the 46h term, given 
 * the initial term and the difference between each two consecutive terms.
 * 
 * @author Kevin
 *
 */
public class Exercise12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial value: ");
		int value = input.nextInt();
		System.out.println("Enter difference between each term and its next: ");
		int diff = input.nextInt();
		
		int fortySixthTerm = value + (45) * diff;
		System.out.println("The 46th term in this sequence is " + fortySixthTerm);
		
		input.close();
	}
}
