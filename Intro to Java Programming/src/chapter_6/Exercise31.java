package chapter_6;

/**
 * Validate a credit card number using methods.
 * @author Kevin
 * 
 */
import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a credit card number as an integer," + 
				" no dashes: ");
		long cardNumber = input.nextLong();
		
		if (isValid(cardNumber) == false)
			System.out.println("Nope, this number isn't valid.");
		else
			System.out.println("Yes, this credit card number is valid.");
		
		input.close();
	}
	
	/** Return true if the card number is valid **/
	public static boolean isValid(long number) {
		
		if (getSize(number) > 16 || getSize(number) < 13)
			return false;
		
		if (!prefixMatched(number, 4) && !prefixMatched(number, 5) &&
				!prefixMatched(number, 6) && !prefixMatched(number, 37))
			return false;
		
		int sumVerify = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		
		if ( sumVerify % 10 != 0)
			return false;
		else
			return true;
	}
	
	/* Double every second digit from right to left. If doubling a digit 
	 * results in a 2-digit number, add up the two digits to get a single digit 
	 * number. The method below adds up all the single-digit numbers. */
	public static int sumOfDoubleEvenPlace(long number) {
		
		String strNumber = number + "";
		int sum = 0;
		
		if (strNumber.length() == 1)
			return 0;
		else {
			for (int i = strNumber.length() - 2; i >= 0; i -= 2) {
				
				char x = strNumber.charAt(i);
				int temp = Character.getNumericValue(x);
				temp *= 2;
				
				if (temp > 10) {
					sum += getDigit(temp);
				}
				else 
					sum += temp;
			}
		}
		
		return sum;
	}
	
	/* Returns number if number is single digit, otherwise 
		adds the digits together and returns the new number */
	public static int getDigit(int number) {
		String strNumber = number + "";
		int sum = 0;
		
		if (strNumber.length() == 1)
			return number;
		else {
			for (int j = 0; j < strNumber.length(); j++) {
				char x = strNumber.charAt(j);
				int temp = Character.getNumericValue(x);
				sum += temp;
		}
		}
		return sum;	
	}
	
	/* Adds all the odd place digits */
	public static int sumOfOddPlace(long number) {
		
		String strNumber = number + "";
		int sum = 0;
		
		for (int i = strNumber.length() - 1; i >= 0; i -= 2) {
			
			char x = strNumber.charAt(i);
			int temp = Character.getNumericValue(x);
			
			sum += temp;
		}
		
		return sum;
	}
	
	/* Return true if the number d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		
		if (d > 99 || d < 1)
			return false;
		else if (d < 10) {
			long onePrefix = getPrefix(number, 1);
			
			if (onePrefix == d)
				return true;
			return false;
		}
		else {
			long twoPrefix = getPrefix(number, 2);
			
			if (twoPrefix == d)
				return true;
			return false;	
		}
	}
	
	/* Number of digits */
	public static int getSize(long d) {
		
		String numberStr = d + "";
		return numberStr.length();
	}
	
	/* Return the first k number of digits from number. If number of digits 
		 in number is less than k, return the number instead. */
	public static long getPrefix(long number, int k) {
		
		String numberStr = number + "";
		String prefix = "";
		
		if (numberStr.length() <= k)
			return number;
		else {
			for (int i = 0; i < k; i++) {
				prefix += numberStr.charAt(i);
			}
		}
		
		long newNumber = Long.parseLong(prefix);
		return newNumber;
	}
}

