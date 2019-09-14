package ooThinking;

public class Player {

	private String name;
	private int height;
	
	Player(String name, int height)
	{
		this.name = name;
		this.height = height;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
		String str = "Name: " + name + ", Height: " + height;
		return str;
	}
	
	
}
