package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/** Game of hangman, except this time using a text file. 
 * Use Command Line: [filename] 
 * @author Kevin
 *
 */
public class Exercise17 {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Invalid command line format.");
			return;
		}
		
		File file = new File(args[0]);
		
		if (!file.exists()) {
			System.out.println("File does not exist.");
			return;
		}
		
		int wordCount = 0;
		String s = "";
		
		Map <Integer, String> words = new TreeMap<Integer, String>();
		
		// Read every word from the file into the map
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				wordCount++;
				s = input.next().toLowerCase();
				words.put(wordCount, s);
			}
			input.close();
			System.out.println(wordCount + " possible number of words.");
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		
		// Start playing hangman!
		int randomKey = (int)(Math.random() * wordCount) + 1;
		String secretWord = words.get(randomKey);
		char[] masked = new char[secretWord.length()];
		
		for (int i = 0; i < secretWord.length(); i++)
			masked[i] = '*';
				
		int wrongGuesses = 0;
		System.out.println("Game of Hangman is starting. All letters are "
				+ "lower case.\n");
		
		Scanner scan = new Scanner(System.in);
		
		while (!String.valueOf(masked).equalsIgnoreCase(secretWord)) {
			
			boolean missed = true;
			
			System.out.print(("(Guess) Enter a letter in the word "
					+ String.valueOf(masked) + " >  "));
			char guess = scan.nextLine().charAt(0);
			guess = Character.toLowerCase(guess);
			
			for (int i = 0; i < secretWord.length(); i++) {
				if (guess == secretWord.charAt(i) && masked[i] == '*') {
					masked[i] = guess;
					missed = false;
				}
				else if (masked[i] == guess) {
					System.out.println(guess + " has already been guessed.");
					missed = false;
				}
			}
			
			if (missed) {
				System.out.println(guess + " is not in the word.");
				wrongGuesses++;
			}
		}
		
		if (wrongGuesses == 1)
			System.out.println("The word is " + secretWord + ". You missed " +
				wrongGuesses + " time.");
		else
			System.out.println("The word is " + secretWord + ". You missed " +
					wrongGuesses + " times.");
	}
}
