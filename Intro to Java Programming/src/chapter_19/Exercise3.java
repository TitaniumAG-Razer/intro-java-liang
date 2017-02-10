package chapter_19;

import java.util.ArrayList;
import java.util.Iterator;

/** Test the removeDuplicates method */
public class Exercise3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(0);
		
		ArrayList<Integer> list2 = removeDuplicates(list1);
		
		// Test the removeDuplicates function
		System.out.println("List 1 items: ");
		Iterator<Integer> iter = list1.iterator();
		while (iter.hasNext())
			System.out.print(iter.next() + " ");
		
		System.out.println("\nList 2 items: ");
		iter = list2.iterator();
		while (iter.hasNext())
			System.out.print(iter.next() + " ");
	}
	
	// Returns an arraylist without the duplicates from the parameter list
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		
		ArrayList<E> newList = new ArrayList<>();
		Iterator<E> iter = list.iterator();
		
		while (iter.hasNext()) {
			E data = iter.next();
			if (!newList.contains(data))
				newList.add(data);
		}
		
		return newList;
	}
}
