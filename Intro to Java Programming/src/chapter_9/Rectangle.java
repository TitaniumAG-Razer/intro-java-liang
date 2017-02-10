package chapter_9;

// Rectangle Class
public class Rectangle {
	
	private double width = 1.0;
	private double height = 1.0;
	
	// Constructors
	Rectangle() {
		
	}
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getWidth() { return width; }
	double getHeight() { return height; }
	
	double getArea() { return height * width; }
	
	double getPerimeter() { return (2 * height) + (2 * width); }
}