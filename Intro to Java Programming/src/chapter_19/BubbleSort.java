package chapter_19;

/** Generic BubbleSort method */
public class BubbleSort {

	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		
		boolean needNextPass = true;
		
		for (int i = 1; i < list.length && needNextPass == true; i++) {
			
			needNextPass = false;
			for (int j = 0; j < list.length - i; j++) {
				if (list[j].compareTo(list[j+1]) > 0) {
					E temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					
					needNextPass = true;
				}
			}
		}
	}
	
	/** Test Generic Bubble Sort */
	public static void main(String[] args) {
		
		String[] list = {"Albert", "Corey", "Zane", "Estelle", "Joshua", "Tita", 
				"Klaudia"};
		
		bubbleSort(list);
		
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i]);
	}	
}
