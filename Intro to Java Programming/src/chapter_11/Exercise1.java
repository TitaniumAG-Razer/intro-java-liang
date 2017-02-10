package chapter_11;

/** Test the Triangle Class **/
public class Exercise1 {
	public static void main(String[] args) {
		
		GeometricObject triangle = new Triangle();
		
		triangle.setColor("Blue");
		System.out.println(triangle.toString());
		System.out.println("Date Created: " + triangle.getDateCreated());
		System.out.println("Color: " + triangle.getColor());
	}
}
