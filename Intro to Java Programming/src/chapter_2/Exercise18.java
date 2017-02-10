package chapter_2;

/**
 * Display a table of points as well as the midpoint of each pair of points.
 * @author Kevin
 *
 */
public class Exercise18 {
	public static void main(String[] args) {
		System.out.println("   a\t\t   b\t\tMiddle Point");
		
		int x1 = 0;
		int y1 = 0;
		int x2 = 2;
		int y2 = 1;
		
		double xMidpoint = (x1 + x2) / 2.0;
		double yMidpoint = (y1 + y2) / 2.0;
		System.out.print("(" + x1 + ", " + y1 + ")\t\t(" + x2 + ", " + y2 + ")");
		System.out.println("\t\t(" + xMidpoint + ", " + yMidpoint + ")");
		
		x1 = 1;
		y1 = 4;
		x2 = 4;
		y2 = 2;
		
		xMidpoint = (x1 + x2) / 2.0;
		yMidpoint = (y1 + y2) / 2.0;
		System.out.print("(" + x1 + ", " + y1 + ")\t\t(" + x2 + ", " + y2 + ")");
		System.out.println("\t\t(" + xMidpoint + ", " + yMidpoint + ")");
		
		x1 = 2;
		y1 = 7;
		x2 = 6;
		y2 = 3;
		
		xMidpoint = (x1 + x2) / 2.0;
		yMidpoint = (y1 + y2) / 2.0;
		System.out.print("(" + x1 + ", " + y1 + ")\t\t(" + x2 + ", " + y2 + ")");
		System.out.println("\t\t(" + xMidpoint + ", " + yMidpoint + ")");
		
		x1 = 3;
		y1 = 9;
		x2 = 10;
		y2 = 5;
		
		xMidpoint = (x1 + x2) / 2.0;
		yMidpoint = (y1 + y2) / 2.0;
		System.out.print("(" + x1 + ", " + y1 + ")\t\t(" + x2 + ", " + y2 + ")");
		System.out.println("\t\t(" + xMidpoint + ", " + yMidpoint + ")");
		
		x1 = 4;
		y1 = 11;
		x2 = 12;
		y2 = 7;
		
		xMidpoint = (x1 + x2) / 2.0;
		yMidpoint = (y1 + y2) / 2.0;
		System.out.print("(" + x1 + ", " + y1 + ")\t\t(" + x2 + ", " + y2 + ")");
		System.out.println("\t\t(" + xMidpoint + ", " + yMidpoint + ")");
	}
}
