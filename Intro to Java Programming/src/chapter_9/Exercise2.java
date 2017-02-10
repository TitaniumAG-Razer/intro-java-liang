package chapter_9;

/**
 * Test the Stock Class.
 * @author Kevin
 *
 */
public class Exercise2 {
	public static void main(String[] args) {
		
		Stock testStock = new Stock("ORCL", "Oracle Corporation");
		testStock.setCurrentPrice(34.35);
		testStock.setPreviousClosingPrice(34.5);
		
		// Print out the percentage change
		System.out.println(testStock.getChangePercent());
	}
}
