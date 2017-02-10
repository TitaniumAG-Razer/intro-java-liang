package chapter_5;

/**
 * Display a Pyramid Pattern of powers of 3. 
 * @author Kevin
 *
 */
public class Exercise19 {
	
	final static int PYRAMID_HEIGHT = 8;
	
	public static void main(String[] args) {
		
		// number of rows
		for (int i = 0; i < PYRAMID_HEIGHT; i++) {
			// "blank spaces/tabs" 
			for (int j = PYRAMID_HEIGHT - 1; j > i; j--) {
				System.out.print(" \t");
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print((int)(Math.pow(3,k)) + "\t");
			}
			
			for (int l = i; l >= 0; l--) {
				System.out.print((int)(Math.pow(3,l)) + "\t");
			}
			
			System.out.println();

		}
	}
}

