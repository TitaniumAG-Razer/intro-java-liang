package chapter_11;

public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	Triangle() {
	}
	
	Triangle(double side1, double side2, double side3) {
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	
	// Getters
	public double getSide1() { return side1; }
	public double getSide2() { return side2; }
	public double getSide3() { return side3; }
	
	// Setters
	public boolean setSide1(double side1) {
		if (side1 <= 0)
			return false;
		this.side1 = side1;
		return true;
	}
	
	public boolean setSide2(double side2) {
		if (side2 <= 0)
			return false;
		this.side2 = side2;
		return true;
	}
	
	public boolean setSide3(double side3) {
		if (side3 <= 0)
			return false;
		this.side3 = side3;
		return true;
	}
	
	/** Use Heron's Formula **/
	public double getArea() {
		double s = getPerimeter() / 2.0;
		double temp = s * (s - side1) * (s - side2) * (s - side3);
		
		return Math.sqrt(temp);		
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + 
				" side3 = " + side3;
	}
}
