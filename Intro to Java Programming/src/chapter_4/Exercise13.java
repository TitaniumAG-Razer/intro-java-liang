package chapter_4;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		
		System.out.print("Enter a letter: ");
		Scanner input = new Scanner(System.in);
		
		String letterString = input.nextLine();
		char c = letterString.charAt(0);
		
		if (c >= 'a' && c <= 'z') {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' 
					|| c == 'u')
				System.out.println("The letter is a vowel.");
			else
				System.out.println("The letter is a consonant.");
		}
		else if (c >= 'A' && c <= 'Z') {
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' 
					|| c == 'U')
				System.out.println("The letter is a vowel.");
			else
				System.out.println("The letter is a consonant.");
		}
		else
			System.out.println("You did not enter a letter!");
			
	}
}
