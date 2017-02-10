package chapter_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Merge 2 lists together.
 * 
 * @author Kevin
 *
 */
public class Exercise31 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of integers for list 1: ");
		int length = input.nextInt();
		int[] list1 = new int[length];
		input.nextLine();

		System.out.print("Enter the integers now: ");
		for (int i = 0; i < list1.length; i++) {
			int number = input.nextInt();
			list1[i] = number;
		}
		input.nextLine();

		System.out.print("Enter the number of integers for list 2: ");
		length = input.nextInt();
		int[] list2 = new int[length];
		input.nextLine();

		System.out.print("Enter the integers now: ");
		for (int i = 0; i < list2.length; i++) {
			int number = input.nextInt();
			list2[i] = number;
		}

		int[] newArray = merge(list1, list2);

		System.out.println("Now displaying...");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
			if ((i + 1) % 10 == 0)
				System.out.println("");
		}

	}

	public static int[] merge(int[] list1, int[] list2) {

		int newLength = list1.length + list2.length;
		int[] mergedArray = new int[newLength];

		for (int i = 0; i < list1.length; i++)
			mergedArray[i] = list1[i];

		for (int i = list1.length; i < newLength; i++)
			mergedArray[i] = list2[i - list1.length];

		Arrays.sort(mergedArray);
		return mergedArray;
	}
}
