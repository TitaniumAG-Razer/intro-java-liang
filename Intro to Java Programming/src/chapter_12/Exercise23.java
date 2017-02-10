package chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/** Read a score text file from the web **/
public class Exercise23 {
	public static void main(String[] args) {
		
		int total = 0;
		int count = 0;
		
		System.out.println("Connecting to "
				+ "http://cs.armstrong.edu/liang/data/Scores.txt");
		
		URL url = null;
		
		try {
			url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");	
		}
		catch (MalformedURLException ex) {
			System.out.println("Invalid url: " + ex.getMessage());
			return;
		}
		
		try (Scanner input = new Scanner(url.openStream())) {
			while (input.hasNextInt()) {
				total += input.nextInt();
				count++;
			}
			System.out.println("Total: " + total);
			System.out.println("Number of scores: " + count);
			System.out.println("Average: " + (total * 1.0)/count);
		}
		catch (IOException ex) {
			System.out.println("Can't read the data.");
		}
		
	}
}
