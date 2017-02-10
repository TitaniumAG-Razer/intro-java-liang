package chapter_12;

import java.util.*;

/** Program that tests InputMismatchException **/
public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("Please enter 2 integers: ");
				int input1 = input.nextInt();
				int input2 = input.nextInt();
				
				System.out.println("Result is " + input1*input2);
				break;
			}
			catch (InputMismatchException e) {
				System.out.println ("You did not enter 2 integers!");
				input.nextLine();
			}
		}
		
		input.close();
	}
}
