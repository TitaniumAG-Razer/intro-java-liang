package chapter_7;

/**
 * Locker Puzzle Game.
 * @author Kevin
 *
 */
public class Exercise23 {
	public static void main(String[] args) {
		
		boolean[] lockers = new boolean[100];
		
		// First student opens every locker
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = true;
		}
		
		// Second student closes every other locker
		for (int i = 1; i < lockers.length; i = i + 2) {
			lockers[i] = false;
		}
		
		// Third and beyond change the locker status of every [x] locker
		for (int i = 2; i < lockers.length; i++) {
			for (int j = i; j < lockers.length; j = j + i + 1) {
				if (lockers[j] == false)
					lockers[j] = true;
				else
					lockers[j] = false;
			}
		}
		
		System.out.println("The open lockers are...");
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == true) {
				System.out.println("Locker " + (i + 1));
			}
		}
	}		
}

