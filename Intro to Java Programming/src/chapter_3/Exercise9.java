package chapter_3;

/**
 * The last digit of an ISBN-10 number is a checksum, which is calculated
 * using a certain formula. If the checksum is 10, the last digit is 
 * denoted as X according to the ISBN-10 convention. 
 * @author Kevin
 *
 */
import java.util.*;

public class Exercise9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN: ");
		String isbnString = input.next();
		
		int isbn = Integer.parseInt(isbnString);
		int checksum = (isbn % 10) * 9;
		int isbnDigits = isbn / 10;
		checksum += (isbnDigits % 10) * 8;
		isbnDigits /= 10;
		checksum += (isbnDigits % 10) * 7;
		isbnDigits /= 10;
		checksum += (isbnDigits % 10) * 6;
		isbnDigits /= 10;
		checksum += (isbnDigits % 10) * 5;
		isbnDigits /= 10;
		checksum += (isbnDigits % 10) * 4;
		isbnDigits /= 10;
		checksum += (isbnDigits % 10) * 3;
		isbnDigits /= 10;
		checksum += (isbnDigits % 10) * 2;
		isbnDigits /= 10;
		checksum += (isbnDigits % 10) * 1;
		isbnDigits /= 10;
		
		checksum = checksum % 11;
		
		if (checksum == 10)
			System.out.println(isbnString + "X");
		else
			System.out.println(isbnString + checksum);
		
		input.close();
	}
}
