package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Remove all occurrences of a specified string from a text file Must be in this
 * format in command line: [String to Remove] [filename]
 * 
 * @author Kevin
 *
 */
public class Exercise11 {
	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 2) {
			System.out.println("Command line format incorrect.");
			return;
		}

		File filename = new File(args[1]);
		if (!filename.exists()) {
			System.out.println(args[1] + " does not exist.");
			return;
		}

		String s = "";

		try {
			Scanner input = new Scanner(filename);
			while (input.hasNext()) {
				s += input.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}
		
		s = s.replaceAll(args[0], "");
		
		try {
			PrintWriter output = new PrintWriter("StringRemoved.txt");
			System.out.println(s);
			output.write(s);
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}

		// Success!
		System.out.println("Complete");
	}
}
