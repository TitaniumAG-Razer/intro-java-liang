package chapter_1;

/**
 * Find the speed in MPH if the person runs 15 kilometers in 50 minutes
 * and 50 seconds.
 * 
 * @author Kevin
 *
 */
public class Exercise10 {
	public static void main(String[] args) {
		int kilometers = 15;
		double minutes = 50.5;
		
		System.out.println("Speed in mph is: ");
		System.out.print((double)(kilometers) / 1.6 * minutes / 60.0);
	}
}
