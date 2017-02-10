package chapter_10;

/** A class to test the MyDate Class **/
public class Exercise14 {
	public static void main(String[] args) {
		
		MyDate current = new MyDate();
		MyDate futureDate = new MyDate(43455555133101L);
		
		System.out.println(current.toString()); // Current Date
		System.out.println();
		System.out.println(futureDate.toString());
	}
}
