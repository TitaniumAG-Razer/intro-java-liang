package chapter_11;
import java.util.*;

public class Account {
	
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	private String name = ""; // name of customer
	private ArrayList<Transaction> transactions;
	
	// public constructor
	Account() {
		dateCreated = new Date();
	}
	
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	Account(int id, double balance, String name) {
		setId(id);
		setBalance(balance);
		this.name = name;
		dateCreated = new Date();
	}
	
	// Accessors
	public int getId() { return id; }
	public double getBalance() { return balance; }
	public double getAnnualInterestRate() { return annualInterestRate; }
	public Date getDateCreated() { return dateCreated; }
	public String getName() { return name; }
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	
	// Mutators
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean setBalance(double balance) {
		if (balance < 0)
			return false;
		this.balance = balance;
		return true;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	// Withdraw from account
	public boolean withdraw(double withdrawal) {
		
		if (withdrawal > balance) {
			System.out.println("Balance is too low for this withdrawal.");
			return false;
		}
		
		balance = balance - withdrawal;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Description of Withdrawal? ");
		String description = input.nextLine();
		
		transactions.add(new Transaction('W', withdrawal, balance, description));
		input.close();
		
		return true;
	}
	
	// Deposit
	public void deposit(double depositAmt) {
		
		balance = balance + depositAmt;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Description of Deposit? ");
		String description = input.nextLine();
		
		transactions.add(new Transaction('W', depositAmt, balance, description));
		input.close();
	}
	
	// Prints Summary
	public void display() {
		System.out.println("Name: " + getName());
		System.out.println("Annual Interest Rate " + getAnnualInterestRate());
		System.out.println("Current Balance: " + getBalance());
		
		Iterator<Transaction> iter = transactions.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
