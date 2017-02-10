package chapter_13;

/** This program tests the GeometricObject comparable interface **/
public class Exercise5 {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(2, 2);
		Rectangle r2 = new Rectangle(3, 8);
		
		if (r1.compareTo(r2) > 0)
			System.out.println("First rectangle has greater area than second rectangle.");
		else if (r1.compareTo(r2) == 0)
			System.out.println("Borh rectangles have same area.");
		else
			System.out.println("First rectangle has less area than second rectangle.");
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5.0);
		
		if (c1.compareTo(c2) > 0)
			System.out.println("Fir"
					+ "st circle has greater area than second circle.");
		else if (c1.compareTo(c2) == 0)
			System.out.println("Borh circles have same area.");
		else
			System.out.println("First circle has less area than second circle.");
	}
}
