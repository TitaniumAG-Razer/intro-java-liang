package chapter_4;

import java.text.DecimalFormat;
/**
 * Create a simple payroll application that gets employee name, hours worked
 * per week, hourly pay rate, and federal/state tax withholding.
 * @author Kevin
 */
import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked per week: ");
		int weeklyHours = input.nextInt();
		System.out.print("Enter hourly pay rate: ");
		double wage = input.nextDouble();
		System.out.print("Enter federal tax withholding rate, " +
				"(e.g. 20% should be input as 0.2): ");
		double federalRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate, " +
				"(e.g. 20% should be input as 0.2): ");
		double stateRate = input.nextDouble();
		double totalRate = stateRate + federalRate;
		double totalDeduction = totalRate * wage * weeklyHours;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked Per Week: " + weeklyHours);
		System.out.println("Pay Rate: $" + form.format(wage));
		System.out.println("Gross Pay Per Week: " + form.format(wage * weeklyHours));
		System.out.println("Deductions: ");
		System.out.println("\tFederal Withholding (" + form.format(federalRate * 100)
			+ "%): " + form.format(federalRate * wage * weeklyHours));
		System.out.println("\tState Withholding (" + form.format(stateRate * 100)
			+ "%): " + form.format(stateRate * wage * weeklyHours));
		System.out.println("\tTotal Deduction: " + form.format(totalDeduction));
		System.out.print("Net Pay: $");
		System.out.println(form.format(wage * weeklyHours - totalDeduction));				
	}
}
