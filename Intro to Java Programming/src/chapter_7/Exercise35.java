package chapter_7;

import java.util.Scanner;

/**
 * Game of Hangman - NOTE: The program is set up so that if you guess
 * a letter incorrectly more than once, the number of wrong guesses goes up
 * EACH TIME you made that same incorrect guess (even though you 
 * already guessed the incorrect letter).
 * 
 * @author Kevin
 *
 */
public class Exercise35 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = {"write", "that", "latin", "forsee", "devastation", 
				"corporeal", "aquatic", "mammal", "requiem", "solstice", "enervate",
				"refractory", "nugatory", "egregious", "dessicate", "tidal", 
				"treehouse"};
		
		int random = (int)(Math.random() * words.length);
				
		String word = words[random];
		char[] masked = new char[word.length()];
		
		for (int i = 0; i < word.length(); i++)
			masked[i] = '*';
				
		int wrongGuesses = 0;
		System.out.println("Game of Hangman is starting. All letters are "
				+ "lower case.\n");
		
		while (!String.valueOf(masked).equalsIgnoreCase(word)) {
			
			boolean missed = true;
			
			System.out.print(("(Guess) Enter a letter in the word "
					+ String.valueOf(masked) + " >  "));
			char guess = input.nextLine().charAt(0);
			guess = Character.toLowerCase(guess);
			
			for (int i = 0; i < word.length(); i++) {
				if (guess == word.charAt(i) && masked[i] == '*') {
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
			System.out.println("The word is " + word + ". You missed " +
				wrongGuesses + " time.");
		else
			System.out.println("The word is " + word + ". You missed " +
					wrongGuesses + " times.");
	}
}
