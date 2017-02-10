package chapter_19;

/** Implement and test a binary search generic method */
public class Exercise7 {
	public static void main(String[] args) {
		Integer[] list = new Integer[7];
		
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 6;
		list[4] = 8;
		list[5] = 10;
		list[6] = 15;
		
		System.out.println("Index of 8 is: " + binarySearch(list, 8));
		System.out.println("Index of -2 is: " + binarySearch(list, -2));
	}
	
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		
		if (list == null)
			return -1;
		
		int low = 0;
		int high = list.length - 1;
		int mid;
		
		while (high >= low) {
			mid = (low + high) / 2;
			if (list[mid].compareTo(key) > 0) // what we want is less than middle element
				high = mid - 1;
			else if (list[mid].compareTo(key) < 0) // what we want is greater than middle element
				low = mid + 1;
			else
				return mid; // index of key found
		}
		
		return -1; // did not find
	}
}
