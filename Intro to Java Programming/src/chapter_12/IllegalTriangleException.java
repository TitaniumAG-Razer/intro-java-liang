package chapter_12;

@SuppressWarnings("serial")
public class IllegalTriangleException extends Exception {
	
	IllegalTriangleException() {
		super("Invalid Triangle Sides");
	}
}
