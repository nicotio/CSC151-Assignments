package labWriteClasses;


public class StringSet {
	
	private String[] strings;
	private int currentElements;
	
	//Create Set
	public StringSet()
	{
		strings = new String[10];
		currentElements = 0;
	}
	
	//Add Strings
	public void addStr(String newStr)
	{
		strings[currentElements] = newStr;
		currentElements++;
		
	}
	
	//Find size
	public int size()
	{
		return currentElements;
	}
	
	//Find # of chars
	public int numChar()
	{
		int num = 0;
		for (int i = 0; i < currentElements; i++)
		{
			num = num + strings[i].length();
		}
		return num;
	}
	
	public int countStr(int len)
	{
		int num = 0;
		for ( int i = 0; i < currentElements; i++)
		{
			if(len == strings[i].length())
			{
				num++;
			}
		}
		
		return num;
		
	}
	
	
}






