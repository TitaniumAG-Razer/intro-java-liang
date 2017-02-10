package chapter_19;

public class GenericStack<E> {

	@SuppressWarnings("unchecked")
	private E[] list = (E[]) new Object[5];
	private int size = 0;

	public int getSize() {
		return size;
	}

	public E peek() {
		if (size == 0)
			return null;
		return list[size - 1];
	}

	public void push(E o) {
		
		if (size == list.length) {
			@SuppressWarnings("unchecked")
			
			// Copy the old array contents to a new one
			E[] newList = (E[]) new Object[list.length * 2];
			for (int i = 0; i < list.length; i++)
				newList[i] = list[i];
			
			// Assign private reference to new list
			list = newList;
		}
		
		list[size] = o;
		size++;
	}

	public E pop() {

		if (size == 0)
			return null;

		E data = list[size - 1];
		list[size - 1] = null;
		size--;
		return data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		
		String s = "";
		
		for (int i = 0; i < size; i++)
			s += list[i] + " ";
		
		return s;
	}
}
