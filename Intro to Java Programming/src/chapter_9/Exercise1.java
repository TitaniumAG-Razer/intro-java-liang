package chapter_9;

import java.text.DecimalFormat;

/**
 * Rectangle Class Testing
 * @author Kevin
 *
 */

public class Exercise1 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		// Testing Rectangle Class
		Rectangle r1 = new Rectangle(4.0, 40.0);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1: ");
		System.out.print("Height: " + r1.getHeight() + "\tWidth: " + r1.getWidth()
			+ "\tArea: " + r1.getArea() + "\tPerimeter " + r1.getPerimeter());
		
		System.out.println("\nRectangle 2: ");
		System.out.print("Height: " + r2.getHeight() + "\tWidth: " + r2.getWidth()
			+ "\tArea: " + form.format(r2.getArea()) + "\tPerimeter " 
				+ r2.getPerimeter());
	}
	
}


