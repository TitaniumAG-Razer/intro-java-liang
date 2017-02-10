package chapter_9;

import java.text.DecimalFormat;

/**
 * Test the Account class
 * @author Kevin
 *
 */
public class Exercise7 {
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("#.##");
		Account bankAccount = new Account(1122, 20000);
		bankAccount.setInterestRate(4.5);
		
		bankAccount.withdraw(2500);
		bankAccount.deposit(3000);
		
		System.out.println("Bank Account Balance: $" 
				+ form.format(bankAccount.getBalance()));
		System.out.println("Monthly Interest: $" + 
				form.format(bankAccount.getMonthlyInterest()));
		System.out.println("Date Created: " + bankAccount.getDate());
	}
}
