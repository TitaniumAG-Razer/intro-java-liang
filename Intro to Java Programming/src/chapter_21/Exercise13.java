package chapter_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Baby name popularity ranking */
public class Exercise13 {
   public static void main(String[] args) {

      int year;
      char gender;
      String name;
      boolean choice = true;
      String line;
      String userResponse;

      Scanner input = new Scanner(System.in);

      while(choice) {
         try {
            System.out.print("Enter a year (2001-2010): ");
            year = input.nextInt();
            if (year > 2010 || year < 2001) {
               System.out.println("Year should be between 2001 and 2010.");
               continue;
            }
            System.out.print("Enter the gender (M/F): ");
            gender = input.next().charAt(0);
            if (Character.toUpperCase(gender) != 'M' && 
                  Character.toUpperCase(gender) != 'F') {
               System.out.println("Invalid gender.");
               continue;
            }

            System.out.print("Enter the name: ");
            name = input.next();

            File file = new File("babynamesranking" + year + ".txt");

            if (file.exists()) {
               Scanner reader = new Scanner(file);
               while (reader.hasNextLine()) {

                  line = reader.nextLine();

                  if (line.contains(name)) {
                     String[] words = line.split(" ");
                     int ranking = Integer.parseInt(words[0]);
                     // boy name
                     if (words[1].equals(name))
                        System.out.println("Boy name " + name + " is ranked #" +
                              ranking + " in year " + year + ".");
                     // girl name
                     if (words[1].equals(name))
                        System.out.println("Girl name " + name + " is ranked #" +
                              ranking + " in year " + year + ".");
                     break; 
                  }
               }
               System.out.println("Name not found.");
            }
            else
               System.out.println("File does not exist.");

            System.out.print("Enter another inquiry (Y/N)? ");
            userResponse = input.next();
            if (userResponse.equalsIgnoreCase("Y"))
               continue;
            else if (userResponse.equalsIgnoreCase("N"))
               break;
            else
               System.out.println("Defaulting to continue.");
         }
         catch (InputMismatchException e) {
            System.out.println("Wrong input.");
            input.nextLine();
         }
         catch (FileNotFoundException ex) {
            ex.printStackTrace();
            continue;
         }
      }
   }
}
