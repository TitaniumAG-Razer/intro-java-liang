package chapter_4;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		
		System.out.println("Enter binary digits (0000 to 1111): ");
		Scanner input = new Scanner(System.in);
		String binaryString = input.nextLine();
		
		char c = binaryString.charAt(0);
		int value = 0;
		
		if (Character.isDigit(c))
			value += ((c - '0') * 8);
		
		c = binaryString.charAt(1);
		if (Character.isDigit(c))
			value += ((c - '0') * 4);
		
		c = binaryString.charAt(2);
		if (Character.isDigit(c))
			value += ((c - '0') * 2);
		
		c = binaryString.charAt(3);
		if (Character.isDigit(c))
			value += ((c - '0') * 1);
		
		System.out.println("The decimal value of " + binaryString + " is " + value);
		input.close();
	}
}
