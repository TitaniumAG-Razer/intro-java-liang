package chapter_13;

/** Test the course class **/
public class Exercise13 {
   public static void main(String[] args) throws CloneNotSupportedException {
      Course math1 = new Course("Algebra");

      math1.addStudent("Jill");
      math1.addStudent("Cameron");
      math1.addStudent("Siaz");
      math1.addStudent("Winona");

      Course math2 = (Course) math1.clone();

      System.out.println(math1.getNumberOfStudents()); // should be 4
      System.out.println(math2.getNumberOfStudents()); // should be 4

      math1.dropStudent("Jill");
      System.out.println(math1.getNumberOfStudents()); // should be 3
      System.out.println(math2.getNumberOfStudents()); // should be 4
   }
}
