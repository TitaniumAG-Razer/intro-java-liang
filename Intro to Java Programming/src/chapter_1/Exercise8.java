package chapter_1;

/**
 * Find the perimeter and area of a circle with radius 6.5 units;
 * 
 */
import java.text.DecimalFormat;

public class Exercise8 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		double radius = 6.5;
		System.out.print("Perimeter of circle with " + radius + " radius is: ");
		System.out.println(df.format(2 * radius * Math.PI));
		System.out.print("Area of circle with " + radius + " radius is: ");
		System.out.println(df.format(Math.pow(radius, 2) * Math.PI));
	}
}
