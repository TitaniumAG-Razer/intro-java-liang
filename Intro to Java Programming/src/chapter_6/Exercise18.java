package chapter_6;

/**
 * Check if the user entered password is valid or not. A valid password must 
 * contain at least 10 characters, consist of ONLY letters and digits, and
 * must contain at least 3 digits.
 * @author Kevin
 * 
 */
import java.util.Scanner;

public class Exercise18 {
	public static void main(String[] args) {
	
		// This program checks if a password is valid
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a password: ");
		String password = input.next();
		
		if (isValidPassword(password) == true)
			System.out.println("This password is valid!");
		else
			System.out.println("Nope, this password won't work.");
		
		input.close();
	}
	
		
	public static boolean isValidPassword (String pw) {
		
		if (pw.length() < 10)
			return false;
		
		int numDigits = 0;
		
		for (int i = 0; i < pw.length(); i++) {
			
			char x = pw.charAt(i);
			
			if (!Character.isDigit(x) && !Character.isLetter(x))
				return false;
			
			if (Character.isDigit(x) == true)
				numDigits++;
		}
		
		if (numDigits < 2)
			return false;
		return true;
	}	
}
