package chapter_7;

/**
 * Sort a string alphabetically.
 * @author Kevin
 *
 */
public class Exercise34 {
	public static void main(String[] args) {
		
		String testString = "dbca";
		String sortedString = sort(testString);
		
		System.out.println(sortedString.toString());
		
	}
	
	public static String sort(String s) {
		
		char[] charArray = new char[s.length()];
		
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = s.charAt(i);
		}
		
		for (int j = 0; j < charArray.length - 1; j++) {
			
			int minIndex = j;
			char minChar = charArray[j];
			
			for (int k = j + 1; k < charArray.length; k++) {
				if (charArray[k] < minChar) {
					minChar = charArray[k];
					minIndex = k;
				}
			}
			
			if (minIndex != j) {
				char temp = charArray[minIndex];
				charArray[minIndex] = charArray[j];
				charArray[j] = temp;
			}
		}
		
		String stringOfChar = "";
		for (int i = 0; i < charArray.length; i++) {
			stringOfChar += charArray[i];
		}
		
		return stringOfChar;
	}
}
