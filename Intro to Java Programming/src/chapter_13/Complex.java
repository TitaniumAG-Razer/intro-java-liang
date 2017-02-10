package chapter_13;

import java.text.DecimalFormat;

/** Complex Numbers **/
public class Complex implements Cloneable {
	
	private double a;
	private double b;
	
	Complex() {
		a = 0;
		b = 0;
	}
	
	Complex(double a) {
		this.a = a;
		b = 0;
	}
	
	Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Complex add(Complex other) {
		double real = this.a + other.a;
		double imag = this.b + other.b;
		
		return new Complex(real, imag);
	}
	
	public Complex subtract(Complex other) {
		double real = this.a - other.a;
		double imag = this.b - other.b;
		
		return new Complex(real, imag);
	}
	
	public Complex multiply(Complex other) {
		double real = this.a * other.a - this.b * other.b;
		double imag = this.b + other.a + this.a * other.b;
		
		return new Complex(real, imag);
	}
	
	public Complex divide(Complex other) {
		double real = (this.a * other.a + this.b * other.b) / 
				(other.a * other.a + other.b * other.b);
		double imag = (this.b * other.a - this.a * other.b) / 
				(other.a * other.a + other.b * other.b);
		
		return new Complex(real, imag);
	}
	
	public double getAbsValue() {
		double value1 = a * a + b * b;
		return Math.sqrt(value1);
	}
	
	public double getRealPart() {
		return a;
	}
	
	public double getImaginaryPart() {
		return b;
	}
	
	@Override
	public String toString() {
		
		DecimalFormat form = new DecimalFormat("#.##");
		
		if (b == 0)
			return "" + form.format(a);
		else
			return "(" + form.format(a) + " + " + form.format(b) + "i)"; 
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Complex complexClone = (Complex)super.clone();
		complexClone.a = this.a;
		complexClone.b = this.b;
		
		return complexClone;
	}
}
