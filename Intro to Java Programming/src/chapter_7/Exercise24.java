package chapter_7;

/**
 * Write a program that simulates picking cards from a shuffled deck
 * of 52 cards repeatedly, and find how many picks are needed
 * before you see one of each suit. Assume a picked card is placed back in
 * the deck before picking another.
 * 
 * @author Kevin
 *
 */
public class Exercise24 {
	public static void main(String[] args) {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] pips = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King"};
		
		int clubsCounter = 0, diamondsCounter = 0, 
				heartsCounter = 0, spadesCounter = 0, 
				overallCounter = 0;
		
		while (clubsCounter == 0 || diamondsCounter == 0 || 
				heartsCounter == 0 || spadesCounter == 0) {
			
			int randomSuit = (int)(Math.random() * 4);
			int randomPips = (int)(Math.random() * 13);
			
			System.out.println(pips[randomPips] + " of " + suits[randomSuit]);
			
			switch(randomSuit) {
			case 0: clubsCounter++; break;
			case 1: diamondsCounter++; break;
			case 2: heartsCounter++; break;
			case 3: spadesCounter++; break;
			}
			
			overallCounter++;
		}
		
		System.out.println("Number of Card Picks: " + overallCounter);		
	}
}
