package chapter_12;

/** Loan Class with Exception Handling this time! **/
public class Loan {
	
	private double annualInterestRate = 2.5;
	private int numberOfYears = 1;
	private double loanAmount = 1000;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/** Construct a loan with specified annual interest rate,
	      number of years, and loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears,
			double loanAmount) {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) throws
		IllegalArgumentException {
		if (annualInterestRate > 0)
			this.annualInterestRate = annualInterestRate;
		else
			throw new IllegalArgumentException("Interest rate must be positive.");
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) throws 
		IllegalArgumentException {
		if (numberOfYears > 0)
			this.numberOfYears = numberOfYears;
		else
			throw new IllegalArgumentException("Number of years"
					+ " must be positive.");
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a newloanAmount */
	public void setLoanAmount(double loanAmount) throws 
		IllegalArgumentException{
		if (loanAmount > 0)
			this.loanAmount= loanAmount;
		else
			throw new IllegalArgumentException("Loan amount"
					+ " must be positive.");
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;    
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;    
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}