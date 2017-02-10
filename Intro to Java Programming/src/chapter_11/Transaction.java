package chapter_11;
import java.util.Date;

public class Transaction extends Account {
	
	private Date date; // date of transaction
	private char type; // type of transaction (W = withdrawal, D = deposit)
	
	private double amount; 
	private double balance; // new balance after transaction
	private String description; // description
	
	Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		date = new Date();
	}
}
