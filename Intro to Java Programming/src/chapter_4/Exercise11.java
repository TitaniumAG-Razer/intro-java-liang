package chapter_4;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		System.out.println("Enter a hex character: ");
		Scanner input = new Scanner(System.in);
		
		String hexChar = input.nextLine();
		char hex = hexChar.charAt(0);
		int val = 0;
		
		if (hex < '0' || hex > 'F') {
			System.out.println(hex + " is an invalid input.");
			System.exit(1);
		}
		else if (hex >= 'A' && hex <= 'F'){
			val = hex - 'A' + 10;
		}
		else {
			val = hex - '0';
		}
		
		System.out.println("The binary value is " + val);
		
	}
}
