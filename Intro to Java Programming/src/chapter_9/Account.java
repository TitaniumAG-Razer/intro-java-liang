package chapter_9;

import java.util.*;

/** A class to monitor and retrieve account information, 
 * mimicking a bank account **/

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date date = new Date();
	
	Account() {

	}
	
	Account(int id, double balance) {
		this.id = id;
		
		if (balance < 0)
			this.balance = 0;
		else
			this.balance = balance;
	}
	
	// Getters
	public int getId() { return id; }
	public double getBalance() { return balance; }
	public double getInterestRate() { return annualInterestRate; }
	public Date getDate() { return date; }
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean setBalance(double balance) {
		if (balance < 0)
			return false;
		this.balance = balance;
		return true;
	}
	
	public boolean setInterestRate(double interestRate) {
		if (interestRate < 0)
			return false;
		this.annualInterestRate = interestRate;
		return true;
	}
	

	public double getMonthlyInterestRate() { return annualInterestRate / 12.0; }
	public double getMonthlyInterest() { return (getMonthlyInterestRate() / 100) *
			balance; }
	
	public boolean withdraw(double withdrawal) {
		if (withdrawal > balance)
			return false;
		balance -= withdrawal;
		return true;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
