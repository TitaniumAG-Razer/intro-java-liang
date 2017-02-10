package chapter_3;

/**
 * Displays a random coordinate in a rectangle, centered at (0,0) with 
 * width 50 and height 150.
 * @author Kevin
 *
 */

public class Exercise16 {
	public static void main(String[] args) {
		int randomX = (int)(Math.random() * 51) - 25; // Min -25, Max 25
		int randomY = (int)(Math.random() * 151) - 75; // Min -75, Max 75
		
		System.out.println("Random Coordinate: (" + randomX + ", " + randomY + ")");
	}
}
