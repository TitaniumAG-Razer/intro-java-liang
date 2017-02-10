package chapter_6;

/**
 * Determine if a given number is a Palindrome or not.
 * @author Kevin
 * 
 */
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int value = input.nextInt();
	
		int newValue = reverse(value);
		
		System.out.println("The palindrome of " + value + " is " + 
				newValue);
		
		if (isPalindrome(value) == true)
			System.out.println(value + " is a palindrome");
		else
			System.out.println(value + " is not a palindrome");
		
		input.close();
	}
		
		// Return reversal of an integer, i.e. 456 becomes 654
		public static int reverse(int number) {
			
			String numberStr = number + "";
			String reverseStr = "";
			
			if (numberStr.length() == 1)
				return number;
			else 
				for (int i = numberStr.length(); i > 0 ; i--) {
					reverseStr += numberStr.charAt(i - 1);
				}
				
				return Integer.parseInt(reverseStr);
		}
		
		public static boolean isPalindrome(int number) {
			
			if (number == reverse(number))
				return true;
			return false;
		}
}