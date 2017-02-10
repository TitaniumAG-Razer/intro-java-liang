package chapter_19;

public class Exercise5 {
	public static void main(String[] args) {
		
		Integer[] list = new Integer[5];
		list[0] = 1;
		
		System.out.println(min(list));
		
		list[1] = 2;
		list[2] = 6;
		list[3] = -2;
		
		System.out.println(min(list));
	}
	
	public static <E extends Comparable<E>> E min(E[] list) {
		
		if (list == null)
			return null;
		
		E minimum = list[0];
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null)
				continue;
			
			if (minimum.compareTo(list[i]) > 0)
				minimum = list[i];
		}
		
		return minimum;
	}
}
