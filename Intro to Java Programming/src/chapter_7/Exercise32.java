package chapter_7;

/**
 * Partition a list based on a "pivot."
 */

import java.util.*;

public class Exercise32 {
	public static void main(String[] args) {

		System.out.println("Enter the number of elements in the list: ");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		input.nextLine();

		int[] list = new int[length];
		System.out.println("Enter the integers now: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

		partition(list);

		System.out.print("\nAfter the partition, the list is ");

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

		input.close();
	}

	public static int partition(int[] list) {
		int partition = list[0];
		int partitionLocation = 0;
		int high = list.length-1;

		while (partitionLocation < high) {

			if ( partition > list[partitionLocation + 1] ) {
				// swap partition and the next item
				list[partitionLocation] = list[partitionLocation+1];
				list[partitionLocation+1] = partition;
				partitionLocation++;
			} 
			else {
				// move the item to the end of the list
				int temp = list[high];
				list[high]=list[partitionLocation+1];
				list[partitionLocation+1] = temp;
				high--;
			}
		}

		return partitionLocation;
	}
}
