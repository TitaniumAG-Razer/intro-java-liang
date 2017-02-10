package chapter_1;

/**
 * Calculate the perimeter and area of a rectangle.
 * 
 * @author Kevin
 * 
 */

import java.text.DecimalFormat;

public class Exercise9 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Area of rectangle with width 5.3 and height 8.6 is: ");
		System.out.println(5.3 * 8.6);
		System.out.println("Perimeter of rectangle with width 5.3 and height 8.6 is: ");
		System.out.println(df.format(5.3 * 2.0 + 8.6 * 2.0));
	}
}
