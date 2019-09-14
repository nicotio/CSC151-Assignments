package labWriteClasses;

public class PortfolioDriver {
	
	public static void main(String[] args)
	{
		String ticker = "Apple";
		int numberShares = 5000 ; 
		double initialPrice = 1;
		StockHolding stockholding = new StockHolding(ticker, numberShares, initialPrice);
		
		String ticker1 = "Windows";
		int numberShares1 = 200 ; 
		double initialPrice1 = 1;
		StockHolding stockholding1 = new StockHolding(ticker1, numberShares1, initialPrice1);
		
		String ticker2 = "Facebook";
		int numberShares2 = 30 ; 
		double initialPrice2 = 1;
		StockHolding stockholding2 = new StockHolding(ticker2, numberShares2, initialPrice2);
		
		String ticker3 = "Twitter";
		int numberShares3 = 40 ; 
		double initialPrice3 = 1;
		StockHolding stockholding3 = new StockHolding(ticker3, numberShares3, initialPrice3);
		
		String ticker4 = "Snapchat";
		int numberShares4 = 20 ; 
		double initialPrice4 = 5;
		StockHolding stockholding4 = new StockHolding(ticker4, numberShares4, initialPrice4);
		
		String ticker5 = "Twitter";
		int numberShares5 = 10 ; 
		double initialPrice5 = 1;
		StockHolding stockholding5 = new StockHolding(ticker5, numberShares5, initialPrice5);
		

		
		
		//ADD PORTFOLIO 1
		PortfolioList.add1(stockholding);
		PortfolioList.add1(stockholding1);
		
		//ADD PORTFOLIO 2
		PortfolioList.add2(stockholding2);
		PortfolioList.add2(stockholding3);
		PortfolioList.add2(stockholding4);
		PortfolioList.add2(stockholding5);
		
		//Print Port1
		for (StockHolding i : PortfolioList.Port1)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		//Print Port2
		for (StockHolding i : PortfolioList.Port2)
		{
			System.out.println(i);
		}
		
		
		System.out.println("-----------------------------------------------------------");
		
		for (StockHolding i : PortfolioList.Port1)
		{
			System.out.println(PortfolioList.toString(i));
		}
		
		PortfolioList.remove(PortfolioList.Port2);
		
		
	}

}
