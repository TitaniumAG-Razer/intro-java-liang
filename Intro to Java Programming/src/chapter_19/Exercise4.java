package chapter_19;

/** Implement and test the linearSearch method */
public class Exercise4 {
	public static void main(String[] args) {
		
		Integer[] list = new Integer[6];
		
		list[0] = 0;
		list[1] = 1;
		list[2] = 2;
		list[3] = 3;
		list[4] = 4;
		list[5] = 5;
		
		System.out.println("Index of 4 is: " + linearSearch(list, 4));
		System.out.println("Index of 10 is: " + linearSearch(list, 10));
	}
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		
		if (list.length == 0)
			return -1; // list is null
		
		for (int i = 0; i < list.length; i++) {
			if (key.equals(list[i]))
				return i;
		}
		
		// Fell through, did not find
		return -1;
	}
}
