package chapter_12;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) 
			throws IllegalTriangleException {
   	
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
    

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide1(double side1) throws IllegalTriangleException {
		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + 
				side1 <= side2)
			throw new IllegalTriangleException();
		else
			this.side1 = side1;
	}

	public void setSide2(double side2) throws IllegalTriangleException {
		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + 
				side1 <= side2)
			throw new IllegalTriangleException();
		else
			this.side2 = side2;
	}

	public void setSide3(double side3) throws IllegalTriangleException {
		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + 
				side1 <= side2)
			throw new IllegalTriangleException();
		else
			this.side3 = side2;
	}

	public double getArea() {
		double p = getPerimeter() / 2.0;
		return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: Side 1 = " + side1 + " Side 2 = " + 
				side2 + " Side 3 = " + side3;
	}
}