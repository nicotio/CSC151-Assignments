package labWriteClasses;
public class StockHolding {
	
	private String ticker;
	private int numberShares;
	private double initialPrice;
	private double currentPrice = 105.5;
	
	public StockHolding(String ticker, int numberShares, double initialPrice)
	{
			this.ticker = ticker;
			this.numberShares = numberShares;
			this.initialPrice = initialPrice;
	}
	
	public String getTicker()
	{
		return ticker;
	}
	
	public int getShares()
	{
		return numberShares;
	}
	
	public double getInitialSharePrice()
	{
		return initialPrice;
	}
	
	public double getCurrentSharePrice()
	{
		return currentPrice;
	}
	
	public double getInitialCost()
	{
		double initialCost = numberShares * initialPrice;
		return initialCost;
	}
	
	public double getCurrentValue() 
	{
		double currentValue = numberShares * currentPrice;
		return currentValue;
	}
	
	public double getCurrentProfit()
	{
		double currentProfit = numberShares * (currentPrice - initialPrice);
		return currentProfit;
	}
	
	public String toString()
	{
		String word = "stock " + ticker + ", " + numberShares + ", shares bought at " + initialPrice + ", current Price "  + currentPrice;
		return word;
	}
	
	public static void main(String[] args)
	{
		String ticker = "apple";
		int numberShares = 8 ; 
		double initialPrice = 1;
		StockHolding stockholding1 = new StockHolding(ticker, numberShares, initialPrice);
		System.out.println(stockholding1.toString());
		System.out.println(stockholding1.getCurrentProfit());
		System.out.println(stockholding1.getCurrentValue());
		System.out.println(stockholding1.getCurrentSharePrice());
	}
}




