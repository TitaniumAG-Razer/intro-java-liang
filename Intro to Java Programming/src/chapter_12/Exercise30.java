package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Count occurrences of each letter in a file **/
public class Exercise30 {
	public static void main(String[] args) {
		
		System.out.print("Enter a filename: ");
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		
		if (!file.exists()) {
			System.out.println("File does not exist");
			input.close();
			return;
		}
		
		String s = "";
		
		int[] letters = new int[26];
		
		for (int i = 0; i < letters.length; i++)
			letters[i] = 0;
		
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				s = reader.nextLine();
				s = s.toLowerCase();
				
				for (int i = 0; i < s.length(); i++) {
					char character = s.charAt(i);
					if (character >= 'a' && character <= 'z')
						letters[character - 'a']++;
				}
			}
			System.out.println("Successfully read from text file.");
			input.close();
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		
		displayOccurrences(letters);
	}
	
	public static void displayOccurrences(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Number of " + (char)(65 + i) + "'s: ");
			System.out.println(arr[i]);
		}
	}
}
