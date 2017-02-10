package chapter_11;

/** Demonstration of PolyMorphism **/
public class Exercise2 {

   public static void main(String[] args) {

       Person person = new Person("person");
       Person student = new Student("student");
       Person employee = new Employee("employee");
       Person faculty = new Faculty("faculty");
       Person staff = new Staff("staff");

       System.out.println(person.toString());
       System.out.println(student.toString());
       System.out.println(employee.toString());
       System.out.println(faculty.toString());
       System.out.println(staff.toString());

   }
}
