package chapter_13;

/** Test the square class **/
public class Exercise22 {
	public static void main(String[] args) {
		
		Square s1 = new Square();
		Square s2 = new Square(2);
		Square s3 = new Square(-3); // should be side = 1, area = 1
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
	}
}
