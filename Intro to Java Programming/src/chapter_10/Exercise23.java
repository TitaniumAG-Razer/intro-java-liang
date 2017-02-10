package chapter_10;

/** A class that tests the MyString2 class **/
public class Exercise23 {
	public static void main(String[] args) {
		
      System.out.println(new MyString2("I'm a string.").toChars());
      MyString2 s1 = new MyString2("test123");
      MyString2 s2 = new MyString2("test123");
      System.out.println("s1 = " + s1.toString());
      System.out.println("s2 = " + s2.toString());
      System.out.println("Is s1 equal to s2? " + s1.compare(s2));
      System.out.println("Value of false changed to uppercase = " + 
      		(MyString2.valueOf(false).toUpperCase().toString()));
      System.out.println("Value of true = " + 
      		(MyString2.valueOf(true).toString() ));
	}
}
