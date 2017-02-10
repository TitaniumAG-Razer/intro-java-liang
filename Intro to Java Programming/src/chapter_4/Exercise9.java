package chapter_4;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		
		System.out.println("Enter a character: ");
		Scanner input = new Scanner(System.in);
		
		char c = input.next().charAt(0);
		
		int s = (int)c;
		System.out.println("The Unicode for the character " + c + " is " + s);
		input.close();
	}
}
