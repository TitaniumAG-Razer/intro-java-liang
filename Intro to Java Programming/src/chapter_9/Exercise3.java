package chapter_9;

/**
 * Test out the Date class.
 * @author Kevin
 */
import java.util.Date;

public class Exercise3 {
	public static void main(String[] args) {
		
		Date testDate = new Date();
		
		// 12000 milliseconds
		testDate.setTime(12000);
		System.out.println(testDate.toString());
		
		// 120000 milliseconds
		testDate.setTime(120000);
		System.out.println(testDate.toString());
		
		testDate.setTime(1200000);
		System.out.println(testDate.toString());
		
		testDate.setTime(12000000);
		System.out.println(testDate.toString());
		
		testDate.setTime(120000000);
		System.out.println(testDate.toString());
		
		testDate.setTime(1200000000);
		System.out.println(testDate.toString());

		testDate.setTime(12000000000L);
		System.out.println(testDate.toString());
		
		testDate.setTime(120000000000L);
		System.out.println(testDate.toString());
	}
}
