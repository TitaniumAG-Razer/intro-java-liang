package chapter_3;

/**
 * Shipping a package - determine the weight and cost.
 * @author Kevin
 * 
 */
import java.util.Scanner;

public class Exercise18 {
	public static void main(String[] args) {
		
		System.out.println("What is the weight of the package?");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		
		if (weight <= 2 && weight > 0)
			System.out.println("The cost is $2.50");
		if (weight <= 4 && weight > 2)
			System.out.println("The cost is $4.50");
		if (weight <= 10 && weight > 4)
			System.out.println("The cost is $7.50");
		if (weight <= 20 && weight > 10)
			System.out.println("The cost is $10.50");
		else
			System.out.println("The package cannot be shipped.");
		
		input.close();
	}
}
