package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** This program converts the Java source code from the next-line brace style
 * to end-of-line brace style.
 * @author Kevin
 *
 */

public class Exercise12 {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Invalid command line format.");
			return;
		}
		
		 StringBuilder buffer = new StringBuilder();
		
		try {
			File file = new File(args[0]);
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String s = input.nextLine();
				
				if (s.contains("{")) {
					buffer.append(" {");
				}
				else
               buffer.append("\n" + s);
				
          }
			 
			input.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}
		
		try {
			PrintWriter output = new PrintWriter("EndOfLineStyle.java");
			System.out.println(buffer);
			output.write(buffer.toString());
			output.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}

	}
}
