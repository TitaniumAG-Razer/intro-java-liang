package chapter_10;

public class Exercise8 {
	public static void main(String[] args) {
		
		Tax tax1 = new Tax();
		
		int[][] brackets2001 = {
			{0, 0, 0, 0}, 
			{27050, 45200, 22600, 36250},
			{65550, 109250, 54625, 93650}, 
			{136750, 166500, 83250, 151650}, 
			{297350, 297350, 148675, 297350}};
	
		double[] rates2001 = { 0.15, 0.275, 0.305, 0.355, 0.391 };
	
		tax1.setFilingStatus(0);

		tax1.setBrackets(brackets2001);
		tax1.setRates(rates2001);
		tax1.setTaxableIncome(400000);
		
		tax1.getTax();
	}
}
