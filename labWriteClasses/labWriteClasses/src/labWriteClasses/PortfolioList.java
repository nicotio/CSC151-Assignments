package labWriteClasses;
import java.util.*;
public class PortfolioList {
	
	static ArrayList<StockHolding> Port1 = new ArrayList<StockHolding>();
	static ArrayList<StockHolding> Port2 = new ArrayList<StockHolding>();

	
	public static void add1(StockHolding stock)
	{
		PortfolioList.Port1.add(stock);
	}
	
	public static void add2(StockHolding stock)
	{
		PortfolioList.Port2.add(stock);
	}
	
	public static void remove(ArrayList<StockHolding> port22)
	{
		port22.remove(port22);
	}
	
	public static String toString(StockHolding stock)
	{
		String word = "stock " + stock.getTicker() + ", " + stock.getShares() + ", shares bought at " + stock.getInitialCost() + ", current Price "  + stock.getCurrentValue();
		return word;
	}

	


}
