package chapter_12;

/** Modify the Loan Class to throw an exception if certain values are <= 0 
 * Test it here. **/
public class Exercise4 {
	public static void main(String[] args) {
		
		Loan loan1 = new Loan();
		
		// Test out clauses
		try {
			loan1.setAnnualInterestRate(-1.0);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		try {
			loan1.setNumberOfYears(-10);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		try {
			loan1.setLoanAmount(-1000);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}

	}
}

