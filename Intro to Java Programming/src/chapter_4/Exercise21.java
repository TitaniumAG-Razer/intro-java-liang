package chapter_4;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		
		System.out.println("Enter a Social Security Number in the format ###-##-####: ");
		Scanner input = new Scanner(System.in);
		
		String ssn = input.next();
		
		if (ssn.matches("\\d{3}-\\d{2}-\\d{4}"))
			System.out.println(ssn + " is a valid Social Security Number.");
		else
			System.out.println(ssn + " is not a valid SSN.");
	}
}
