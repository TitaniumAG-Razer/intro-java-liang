package chapter_10;

import java.text.DecimalFormat;

/** A class that represents various tax brackets **/
public class Tax {
	
	// Constants
	final int SINGLE_FILER = 0;
	final int MARRIED_JOINTY_OR_QUALIFYING_WIDOWER = 1;
	final int MARRIED_SEPARATELY = 2;
	final int HEAD_OF_HOUSEHOLD = 3;
	
	// Data variables
	private int filingStatus = SINGLE_FILER;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	// Constructors
	Tax() {
		
	}
	
	Tax (int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		
		setFilingStatus(filingStatus);
		setBrackets(brackets);
		setRates(rates);
		setTaxableIncome(taxableIncome);
	}
	
	// Accessors
	public int getFilingStatus() { return filingStatus; }
	public int[][] getBrackets() { return brackets; }
	public double[] getRates() { return rates; }
	public double getTaxableIncome() { return taxableIncome; }

	// Mutators
	public boolean setFilingStatus (int filingStatus) {
		
		if (filingStatus < SINGLE_FILER || filingStatus > HEAD_OF_HOUSEHOLD)
			return false;
		this.filingStatus = filingStatus;
		return true;
	}
	
	public void setBrackets ( int[][] brackets ) {
		
		int rows = brackets.length;
		int cols = brackets[0].length;
		
		this.brackets = new int[rows][cols];
		
		for (int i = 0; i < brackets.length; i++) {
			for (int j = 0; j < brackets[i].length; j++) {
				this.brackets[i][j] = brackets[i][j];
			}
		}
	}
	
	public void setRates ( double[] rates ) {
		
		this.rates = new double[rates.length];
		for (int i = 0; i < rates.length; i++) {
			this.rates[i] = rates[i];
		}
	}
	
	public boolean setTaxableIncome (double taxableIncome) {
		
		if (taxableIncome < 0)
			return false;
		this.taxableIncome = taxableIncome;
		return true;
	}
	
	// Compute Tax Liability
	public void getTax() {
		
		double taxableIncomeRemaining = this.taxableIncome;
		double incomeToSubtract = 0.0;
		double taxTotal = 0.0;
		int highestTaxBracket = this.brackets.length - 1;
		
		while (taxableIncomeRemaining > 0 && highestTaxBracket >= 0) {
			
			if (taxableIncomeRemaining > brackets[highestTaxBracket][filingStatus]) {
				incomeToSubtract = taxableIncomeRemaining - brackets[highestTaxBracket][filingStatus];
				taxableIncomeRemaining -= incomeToSubtract;
				taxTotal += (rates[highestTaxBracket]) * incomeToSubtract;
			}
			
			highestTaxBracket--;
		}
		
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		
		System.out.println("With a taxable income of $" + formatter.format(getTaxableIncome()) + ", your tax liability is " 
				+ "$" + formatter.format(taxTotal) + "based on 2001 federal tax brackets");
	}
}
