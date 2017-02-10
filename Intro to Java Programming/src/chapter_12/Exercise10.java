package chapter_12;

/** Testing Out of Memory Error **/
public class Exercise10 {
	public static void main(String[] args) {
		
		try {
			String[] firstArray = new String[1000];
			System.out.println("Successfully created array with 1000 elements");
			String[] stringArray = new String[500000000];
			System.out.println("Successfully created array with 500000000 elements");
		}
		catch (OutOfMemoryError ex){
			System.out.println("Not enough memory.");
		}
	}
}
