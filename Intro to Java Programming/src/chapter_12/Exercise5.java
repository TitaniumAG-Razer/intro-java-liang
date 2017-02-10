package chapter_12;

/** Tests the IllegalTriangleException Class **/
public class Exercise5 {
	public static void main(String[] args) {
		
		Triangle triangle1, triangle2;
		
		try {
			triangle1 = new Triangle();
			System.out.println(triangle1.toString());
			triangle2 = new Triangle(1.5, 2.5, 4.0);
			System.out.println(triangle2.toString());
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex);
		}
	}
}
