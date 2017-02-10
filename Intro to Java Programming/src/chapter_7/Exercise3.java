package chapter_7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Count the number of occurrences of each number (1-50).
 * @author Kevin
 *
 */
public class Exercise3 {
	public static void main(String[] args) {
		
		System.out.print("Enter the integers between 1 and 50. 0 means quit: ");
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> intArray = new ArrayList<>();
		
		while (true) {
			int nextInput = input.nextInt();
			
			if (nextInput == 0)
				break;
			else if (nextInput < 1 || nextInput > 50)
				continue;
			else
				intArray.add(nextInput);
		}
		
		for (int i = 1; i <= 50; i++) {
			int count = 0;
			Iterator<Integer> iter = intArray.iterator();
			
			while (iter.hasNext()) {
				int value = iter.next();
				if (i == value)
					count++;
			}
			
			if (count == 1)
				System.out.println(i + " occurs 1 time.");
			else if (count > 1)
				System.out.println(i + " occurs " + count + " times.");
		}
		
		input.close();
	}
}
