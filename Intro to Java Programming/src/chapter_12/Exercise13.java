package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/** This program counts the characters, words, and lines in a file. **/

public class Exercise13 {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Invalid command line format.");
			return;
		}
		
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("The file doesn't exist.");
			return;
		}
		
		int words = 0;
		int characters = 0;
		int lines = 0;
		
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				lines++;
				String line = input.nextLine();
				characters += line.length();
				words += new StringTokenizer(line, " ,").countTokens();
			}
			
			System.out.println("Words: " + words);
			System.out.println("Characters: " + characters);
			System.out.println("Lines: " + lines);
			input.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not found.");
		}
	}
}
