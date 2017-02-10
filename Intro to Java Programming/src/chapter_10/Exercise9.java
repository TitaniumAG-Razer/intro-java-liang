package chapter_10;

/** A class that tests the Course Class **/
public class Exercise9 {
	public static void main(String[] args) {
		
		Course math = new Course("Math");
		math.addStudent("Carl");
		math.addStudent("Jenny");
		math.addStudent("Sebastian");
		
		math.dropStudent("Carl");
		
		System.out.println(math.toString());
	}
}
