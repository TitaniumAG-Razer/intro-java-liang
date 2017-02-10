package chapter_6;

import java.text.DecimalFormat;

/**
 * Simulate a game of single-player craps 15,000 times.
 * Display the percent win rate.
 * @author Kevin
 *
 */
public class Exercise32 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.###");
		int lossCount = 0;
		int winCount = 0;
		
		for (int i = 0; i < 15000; i++) {
			if (playCraps())
				winCount++;
			else
				lossCount++;
		}
		
		double winRate = (winCount * 1.0) / (lossCount + winCount);
		
		System.out.println("You won " + form.format(winRate * 100.0) 
			+ "% of your games.");
	}
	
	public static boolean playCraps() {
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;

		int sum = dice1 + dice2;

		if (sum == 2 || sum == 3 || sum == 12) {
			return false;
		}
		else if (sum == 7 || sum == 11) {
			return true;
		}
		else {
			int point = sum;

			do {
				dice1 = (int)(Math.random() * 6) + 1;
				dice2 = (int)(Math.random() * 6) + 1;
				sum = dice1 + dice2;
			} while (!(sum == point || sum == 7));

			if (sum == 7) {
				return false;
			}
			else {
				return true;
			}
		}
	}
}

