package chapter_6;

/** Number of days in a year */
public class Exercise16 {
   public static void main(String[] args) {
      
      for (int i = 2014; i <= 2034; i++)
         System.out.println("The year " + i + " has " + 
      numberOfDaysInAYear(i) + " days.");
   }
   
   public static int numberOfDaysInAYear(int year) {
      
      if (year % 4 != 0)
         return 365;
      else if (year % 100 != 0)
         return 366;
      else if (year % 400 != 0)
         return 365;
      else
         return 366;
   }
}
