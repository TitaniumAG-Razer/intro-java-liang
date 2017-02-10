package chapter_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Count number of even and odd numbers in an ArrayList.
 * @author Kevin
 *
 */
public class Exercise5 {
	public static void main(String[] args) {

		System.out.print("Enter integers. 0 means quit: ");
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> intArray = new ArrayList<>();

		while (true) {
			int nextInput = input.nextInt();

			if (nextInput == 0)
				break;
			else
				intArray.add(nextInput);
		}

		Iterator<Integer> iter = intArray.iterator();
		int evenCount = 0; 
		int oddCount = 0;

		while (iter.hasNext()) {
			
			int value = iter.next();
			if (value % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}

		System.out.println("The number of odd numbers: " + oddCount);
		System.out.println("The number of even numbers: " + evenCount);
		
		input.close();
	}
}
