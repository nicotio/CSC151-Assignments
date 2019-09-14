package ooThinking;

public class BritishPurse {
	
	private int pence;
	private int shils;
	
	public BritishPurse()
	{
		pence = 0;
		shils= 0;
	}
	
	public int givePence(int freePence)
	{
		pence = pence + freePence;
		return pence;
	}
	
	public int giveShillings(int freeShil)
	{
		shils = shils + freeShil;
		return shils;
	}
	
	public String query()
	{
		String string ="The purse has " + pence + " pence, and " + shils + " shillings";
		return string;
	}

}
