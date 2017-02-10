package chapter_12;

/** Test the binary2Decimal method using Exception Handling **/
public class Exercise7 {
	public static void main(String[] args) {

		try {
			int decimal = binary2Decimal("1111");
			System.out.println(decimal);
			decimal = binary2Decimal("ABCD");
			System.out.println(decimal);
		}
		catch (NumberFormatException ex) {
			System.out.println(ex);
		}
	}

	public static int binary2Decimal(String binaryString) throws
		NumberFormatException {

		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if ((binaryString.charAt(i) != '0') && (binaryString.charAt(i) != '1'))
				throw new NumberFormatException(binaryString + 
						" is not a binary string");
			char binaryStringChar = binaryString.charAt(i);
			decimalValue = decimalValue * 2 + ((int)(binaryStringChar) - 48);
		}

		return decimalValue;
	}

	/* Alternative Algorithm 

	public static int integerFromBinary(String str){
		double j=0;
    	for (int i=0; i<str.length(); i++) {
    	
         if(str.charAt(i)== '1') 
         	j = j+ Math.pow(2,str.length()-1-i);
		}
      
      return (int) j;

	 */
}

