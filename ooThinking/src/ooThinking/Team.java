package ooThinking;

public class Team {
	
	private Player[] myTeam;
	private int size;
	public static final int MAX_VALUE = 3;

	public Team()
	{
		myTeam  = new Player[MAX_VALUE];
		size = 0;
	}
	
	public Team(int players)
	{
		myTeam = new Player[players];
	}
	
	public void add(Player player)
	{
		myTeam[size++] = player;
		
	}
	
	Player[] getCurrentTeamMembers()
	{
		Player[] currentTeam = new Player[size];
		for ( int i = 0;  i < size ; i++)
		{
			currentTeam[i] = myTeam[i];
		}
		return currentTeam;
	}

	
	public int averageHeight()
	{
		int height = 0;
		if(size == 0)
		{
			return 0;
		}
		
		for(int i = 0; i < MAX_VALUE; i++)
		{
			height = height + myTeam[i].getHeight();
		}
			height = height / size;
		return height;
	}
	
	public String toString()
	{
		String string="";
		for(int i = 0; i < size; i++)
		{
			string = string + myTeam[i].toString() + ",   " ;
		}
		
		return "The team has " + size + " players. " + string;
		
	}
	
	/*
	public Player[] getMyTeam() {
		return myTeam;
	}

	public void setMyTeam(Player[] myTeam) {
		this.myTeam = myTeam;
	}
	*/
	
	
}
