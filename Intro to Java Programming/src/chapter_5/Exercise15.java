package chapter_5;

/**
 * Display an ASCII character table from ! to ~
 * 
 * @author Kevin
 *
 */

public class Exercise15 {
	public static void main(String[] args) {

		for (char i = '!'; i <= '~'; i++) {

			System.out.print(i + " ");
			if ((i - 32) % 10 == 0) {
				System.out.println("");
			}
		}
	}
}
