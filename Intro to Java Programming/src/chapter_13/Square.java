package chapter_13;

public class Square extends GeometricObject implements Cloneable {

	private double side;
	
	Square() {
		side = 1.0;
	}
	
	Square(double side) {
		if (side <= 0)
			this.side = 1.0;
		else
			this.side = side;
	}
	
	public boolean setSide(double side) {
		if (side <= 0)
			return false;
		this.side = side;
		return true;
	}
	
	public double getSide() { return side; }
	
	@Override
	public int compareTo(Object arg0) {
		return (int) (this.getArea() - ((Square) arg0).getArea());
	}

	@Override
	public double getArea() {
		
		return side * side;
	}

	@Override
	public double getPerimeter() {
		
		return side * 4;
	}
	

}
