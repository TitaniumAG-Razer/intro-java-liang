package chapter_7;

import java.util.Arrays;

/**
 * Bubble Sort.
 * @author Kevin
 *
 */
public class Exercise18 {
	public static void main(String[] args) {
		// Test out the bubble sort
		double[] array1 = { 5.5, 4.5, 3.5, 2.5, 9.0, -1.5, 2.5, 3.5, 6.7, 7.2};

		System.out.println("Before Bubble Sort: ");
		System.out.println(Arrays.toString(array1));

		bubbleSort(array1);

		System.out.println("After Bubble Sort: ");
		System.out.println(Arrays.toString(array1));
	}

	public static void bubbleSort(double[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[i]) {
					double temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
}
