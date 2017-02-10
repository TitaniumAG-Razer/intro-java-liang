package chapter_10;

/** A class that represents various courses students may enroll in */ 
public class Course {
	
	final int DEFAULT_SIZE = 50;
	final int GREATER_SIZE = 100;
	
	private String courseName;
	private String[] students = new String[DEFAULT_SIZE];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		initializeStudentArray();
	}
	
	public void addStudent(String student) {
		
		if (numberOfStudents == DEFAULT_SIZE) {
			String[] newStudentArray = new String[GREATER_SIZE];
			for (int i = 0; i < 100; i++)
				newStudentArray[i] = students[i];
			
			students = newStudentArray;
		}
		
		if (numberOfStudents == 200) {
			System.out.println("Class is full.");
			return;
		}
		
		int i = 0;
		
		while (i < students.length) {
			
			if (students[i] == "") {
				students[numberOfStudents] = student;
				numberOfStudents++;
				break;
			}
			
			i++;
		}
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				students[i] = "";
				numberOfStudents--;
				System.out.println("Successfully dropped student.");
				return;
			}
		}
		
		// Did not find
		System.out.println("Did not find student.");
	}
	
	public void clear() {
		for (int i = 0; i < students.length; i++) 
			students[i] = "";
		numberOfStudents = 0;
	}
	
	public String toString() {
		String display = "Course: " + courseName + "\nStudents: \n";
		
		for (int i = 0; i < students.length; i++) {
			if (!students[i].equals(""))
				display += students[i] + "\n";
		}
		
		return display;
	}
	
	// private helper method
	private void initializeStudentArray() {
		for (int i = 0; i < students.length; i++) {
			students[i] = "";
		}
	}
}
