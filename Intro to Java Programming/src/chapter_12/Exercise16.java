package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Replace every instance of [oldString] with [newString], and 
 * then change the original file.
 * Command Line Format: filename oldString newString
 * @author Kevin
 *
 */

public class Exercise16 {
	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Invalid command line format.");
			return;
		}

		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File does not exist.");
			return;
		}

		String s = "";

		// Read in the file, and "fix" the string
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				s += input.nextLine();
			}
			s = s.replaceAll(args[1], args[2]);
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not found.");
		}
		
		// Write the string to the file
		try {
			// Clear existing file
			PrintWriter clear = new PrintWriter(file);
			clear.close();
			// Write out new input to file
			PrintWriter output = new PrintWriter(file);
			output.write(s);
			output.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not found.");
		}
	}
}
