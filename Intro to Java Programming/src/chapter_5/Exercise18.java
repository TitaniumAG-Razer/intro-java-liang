package chapter_5;

/**
 * Display 4 different patterns.
 * @author Kevin
 *
 */
public class Exercise18 {
	public static void main(String[] args) {
		
		System.out.println("Pattern A");
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern B");
		for (int i = 6; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern C");
		for (int i = 6; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			
			for (int k = 6 - i; k >= 0; k--)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println("\nPattern D");
		for (int i = 6; i > 0; i--) {
			for (int k = 6 - i; k > 0; k--) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
