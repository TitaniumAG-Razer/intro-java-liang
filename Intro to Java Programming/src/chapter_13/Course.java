package chapter_13;

public class Course implements Cloneable {
	  private String courseName;
	  private String[] students = new String[4];
	  private int numberOfStudents;
	    
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
	    students[numberOfStudents] = student;
	    numberOfStudents++;
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
	   	 if (student.equalsIgnoreCase(students[i])) {
	   		 students[i] = "";
	   		 numberOfStudents--;
	   	 }
	    }
	  }
	  
	  public Object clone() throws CloneNotSupportedException {
		  Course courseClone = (Course)super.clone();
		  
		  courseClone.courseName = this.courseName;
		  courseClone.students = this.students.clone();
		  courseClone.numberOfStudents = this.numberOfStudents;
		  
		  return courseClone;
	  }
	}