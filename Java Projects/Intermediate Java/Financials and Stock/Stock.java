 /*  Program 3a
  *  Financials Class and Stock class to implement a has-a relationship.
  *  CS108-1
  *  06 June 2021
  *  @author  Rita Herfi
  */
public class Stock {
	private String ticker; //ticker or symbol of stock
	private String name; //name of listed public company
	private int numShares; //the total quantity of shares owned
	private double currValue; //the current value of the stock
	private double totValue; //the total value of the stocks owned (totValue = currValue * numShares)
	private Financials quarFinancials; //the financials for the last quarter
	private Financials annFinancials; //the financials for the last annual year
	
	/**
	 * 
	 * @param ticker
	 * @param name
	 * @param numShares
	 * @param currValue
	 * Constructor initializes values and calculates total values
	 */
	public Stock(String ticker, String name, int numShares, double currValue) {
		this.ticker = ticker;
		this.name = name;
		this.numShares = numShares;
		this.currValue = currValue;
		totValue = numShares * currValue;
	}
	/**
	 * 
	 * @return String as specified by instructions
	 */
	public String getStockInfo() {
		return name + " (" + ticker + ")" + "; Total Shares Owned: " + numShares + "; Total Value: " + totValue;
	}
	/**
	 * 
	 * @param shares
	 * Adds shares to numShares then changes the value of totalValue
	 */
	public void buyShares(int shares) {
		numShares += shares;
		totValue = numShares * currValue;
	}
	/**
	 * 
	 * @param shares
	 * Subtracts shares from numShares as long as shares is less than
	 * or equal to numShares since we can't have negative shares
	 * Recalculates totalValue after sold shares 
	 */
	public void sellShares(int shares) {
		if(shares <= numShares) {
		numShares -= shares;
		totValue = numShares * currValue;
		}
	}
	/**
	 * 
	 * @param financial
	 * @param option
	 * Sets financials on quarterly or annually depending on user input
	 * Will output an error if not "quarter" or "annual"
	 */
	public void setFinancials(Financials financial, String option){
		if (option.equals("quarter")) {
			quarFinancials = financial;
		}
		else if(option.equals("annual")) {
			annFinancials = financial;
		}
		else {
			System.out.println("Error: Wrong Option");
		}
	}
	/**
	 * 
	 * @param option
	 * Depending on the option, will return quarter or annual financials
	 * using toString() from the Financials class
	 */
	public String getFinancials(String option) {
		String f = " ";
		if(option.equals("quarter")) {
		//return financials of company using to string for quarter
			f = quarFinancials.toString();
		}
		else if(option.equals("annual")) {
			//return financials of company using to string for annual
			f = annFinancials.toString();
		}
		return f;
	}
	/**
	 * 
	 * @return String
	 * As specified by spec, Program name and author name
	 */
	public String getInfo() {
		return "Program 3a, Rita Herfi";
	}
	
}
