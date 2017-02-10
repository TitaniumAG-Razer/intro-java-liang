package chapter_9;

/** Test the Fan Class **/
public class Exercise8 {

   public static void main(String[] args) {

       Fan fan1 = new Fan();
       fan1.setSpeed(Fan.FAST);
       fan1.setOn(true);
       fan1.setRadius(10);
       fan1.setColor("Yellow");

       Fan fan2 = new Fan();
       fan2.setSpeed(Fan.MEDIUM);
       fan2.setRadius(5);
       fan2.setColor("Blue");
       fan2.setOn(false);

       System.out.println("Fan #1: "+ fan1.toString());
       System.out.println("Fan #2: "+ fan2.toString());
   }
}
