package chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Write a program to create a file where you write 120 integers
 * into it. Integers are separated by spaces. Then read the data
 * back from the file and display the data in increasing order.
 * @author Kevin
 * a
 */
public class Exercise15 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("Exercise12_15.txt");
		
		if (file.exists()) {
			System.out.println("This file already exists; can't write to it.");
			return;
		}
		
		// Write 120 array elements to the file
		try (PrintWriter output = new PrintWriter(file); ) {
			int[] array = new int[120];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 100);
				output.write(array[i] + " ");
				 if ((i + 1) % 10 == 0) 
					 output.println();
			}
			output.close();
		}
		
		// Read the data back from the file and display in increasing order
		Scanner input = new Scanner(file);
		int[] sortedArray = new int[120];
		int index = 0;
		
		try {
			while (input.hasNextInt()) {
				sortedArray[index] = input.nextInt();
				index++;
			}
			
			java.util.Arrays.sort(sortedArray);
			System.out.println(java.util.Arrays.toString(sortedArray));
			input.close();
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index out of bounds!");
		}
		catch (InputMismatchException e) {
			System.out.println("One or more input data are not numbers.");
		}

	}
}