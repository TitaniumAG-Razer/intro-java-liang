package chapter_5;

import java.text.DecimalFormat;

/**
 * Compute the cost of university tuition in 10 years, and how much
 * a 4 year college education costs by then.
 * 
 * @author Kevin
 *
 */
public class Exercise7 {
	public static void main(String[] args) {
		
		final double RATE = 1.06;
		DecimalFormat form = new DecimalFormat("#.##");
		double tuition = 10000.00;
		
		for (int i = 0; i < 11; i++) {
			System.out.println("This is Year " + i + " and the tuition is $" + 
					form.format(tuition));
			tuition *= RATE;
		}
		
		double totalTuition = 0;
		
		for (int i = 0; i < 4; i++) {
			tuition *= RATE;
			totalTuition += tuition;
		}
		
		System.out.println("4 years of tuition, 10 years from now, will "
				+ "cost a total of: $" + form.format(totalTuition));
	}
}
