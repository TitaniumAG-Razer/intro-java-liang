package chapter_5;

/**
 * Sum of a series, (1/2) + (2/3) + ...(97/98)
 * @author Kevin
 *
 */
public class Exercise24 {
	public static void main(String[] args) {
		
		double result = 0.0;
		
		for (double i = 97.0, j = 98.0; i >= 1.0; i--, j--) {
			result += i/j;
		}
		
		System.out.println(result);
	}
}
