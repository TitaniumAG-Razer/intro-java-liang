package chapter_9;

public class Stock {

	private String symbol;
	private String name;
	private double previousClosingPrice; // closing price for previous day
	private double currentPrice; // stock price for current time
	
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public void setPreviousClosingPrice(double prev) {
		previousClosingPrice = prev;
	}
	
	public void setCurrentPrice(double price) {
		currentPrice = price;
	}
	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}
