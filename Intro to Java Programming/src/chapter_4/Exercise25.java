package chapter_4;

/**
 * Generate random vehicle plate numbers!
 * @author Kevin
 *
 */
public class Exercise25 {
	public static void main(String[] args) {
		
		int randomChar = (int)(Math.random() * 26) + 65;
		char c1 = (char)randomChar;
		randomChar = (int)(Math.random() * 26) + 65;
		char c2 = (char)randomChar;
		randomChar = (int)(Math.random() * 26) + 65;
		char c3 = (char)randomChar;
		
		String licensePlate = "" + c1 + c2 + c3;
		for (int i = 0; i < 4; i++)
			licensePlate += "" + (int)(Math.random() * 10);

		System.out.println("Generating a random License Plate Number...");
		System.out.println(licensePlate);	
	}
}
