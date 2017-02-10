package chapter_5;

/**
 * Find all the "perfect numbers" between 1 and 10000. A perfect number
 * is equal to the sum of all its positive divisors, excluding itself. 
 * @author Kevin
 *
 */

public class Exercise33 {
	public static void main(String[] args) {
		
		int currentNumber = 1; // Current number 
		int count = 0; // Perfect numbers discovered
		
		while (count <= 4) {
			
			int divisor = currentNumber / 2;
			int sum = 0;
			
			while (divisor > 0) {

				if (currentNumber % divisor == 0)
					sum += divisor;
				
				divisor--;
			}
			
			if (sum == currentNumber) {
				System.out.println(currentNumber + " is a perfect number.");
				count++;
			}
				
			currentNumber++;
		}
	}
}
