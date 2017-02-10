package chapter_1;

import java.text.NumberFormat;
import java.util.Locale;

/** Given one birth every 7 seconds, one death every 13 seconds, and
 * one new immigrant every 45 seconds, display how many of each 
 * in every category there will be in one year.
 * 
 * @author Kevin
 *
 */

public class Exercise11 {
	public static void main(String[] args) {
		
		int currentPopulation = 312032486;
		
		// 365 days/year * 24 hours/day * 3600 seconds/hour divided by 7
		int births = ((int)(365.0 * 24 * 3600 / 7.0));
		// 365 days/year * 24 hours/day * 3600 seconds/hour divided by 13
		int deaths = ((int)(365.0 * 24 * 3600 / 13.0));
		// 365 days/year * 24 hours/day * 3600 seconds/hour divided by 13
		int immigration = ((int)(365.0 * 24 * 3600 / 45.0));
		
		for (int i = 1; i < 6; i++) {
			currentPopulation = currentPopulation + births - deaths + immigration;
			System.out.print("After " + i + " years: ");
			System.out.println
				(NumberFormat.getNumberInstance(Locale.US).format(currentPopulation));
		}
	}
}
