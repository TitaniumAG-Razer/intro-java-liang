package chapter_17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Loan Class that implements Serializable, then create five Loan objects and
 * store them in a file named Exercise17_06.dat
 * 
 * @author Kevin
 *
 */
public class Exercise6 {
   public static void main(String[] args) throws IOException {

      Loan firstLoan = new Loan();
      Loan secondLoan = new Loan();
      Loan thirdLoan = new Loan();
      Loan fourthLoan = new Loan();
      Loan fifthLoan = new Loan();

      try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_06.dat"));) {
         output.writeObject(firstLoan);
         output.writeObject(secondLoan);
         output.writeObject(thirdLoan);
         output.writeObject(fourthLoan);
         output.writeObject(fifthLoan);

         System.out.println("Writing successful.");
      }

   }
}
