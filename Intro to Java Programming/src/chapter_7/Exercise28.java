package chapter_7;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter 10 integers and display
 * all combinations of picking 2 numbers from the 10.
 * @author Kevin
 *
 */
public class Exercise28 {
	public static void main(String[] args) {
		
		int[] array = getTenIntegers();
		
		// Print out ALL combinations 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == i)
					continue;
				else
					System.out.println(array[i] + " and " + array[j]);
			}
		}
	}
	
	public static int[] getTenIntegers() {
		
		int[] integerArray = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 10 integers: ");
		
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = input.nextInt();
		}
		
		input.close();
		return integerArray;
	}
}
