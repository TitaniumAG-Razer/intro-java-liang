package chapter_9;

/**
 * Test the StopWatch class
 * @author Kevin
 *
 */
public class Exercise6 {
	public static void main(String[] args) {
		
		int[] randomNums = new int[100000];
		
		// Initialize the array with numbers 0 - 4,999
		for (int i = 0; i < randomNums.length; i++)
			randomNums[i] = (int)(Math.random() * 5000);
		
		// Selection Sort Timing
		StopWatch timer = new StopWatch();
		selectionSort(randomNums);
		timer.end();
		int elapsedTime = (int) (timer.getElapsedTime() / 1000.0);
				
		System.out.println("Time taken for selection sort of "
				+ "100,000 array elements: ");
		System.out.println(elapsedTime + " seconds");
		
		// re-fill the array with random numbers
		for (int i = 0; i < randomNums.length; i++)
			randomNums[i] = (int)(Math.random() * 5000);
		
		// Quick Sort Timing
		timer.start();
		java.util.Arrays.sort(randomNums);
		timer.end();
		elapsedTime = (int) (timer.getElapsedTime() / 1000.0);
		
		System.out.println("Time taken for quicksort of "
				+ "100,000 array elements: ");
		System.out.print(elapsedTime + " seconds");
	}
	
	public static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			
			int minimum = array[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < minimum) {
					minimum = array[j];
					currentMinIndex = j;
				}

			if (currentMinIndex != i) {
				int temp = array[i];
				array[i] = array[currentMinIndex];
				array[currentMinIndex] = temp;
			}
			
			}	
		}
	}
}
