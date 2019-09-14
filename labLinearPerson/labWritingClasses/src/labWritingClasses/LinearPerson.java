package labWritingClasses;

public class LinearPerson {
	
	private int position;
	private int direction;
	
	public LinearPerson() 
	{
		this(0, 0);
	}

	public LinearPerson(int position, int direction)
	{
		this.position = position;
		this.direction = direction;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public String getDirection()
	{
		String arrow = "right";
		if (direction == 0)
		{
			return arrow;
		}
		else
		{
			arrow = "left";
			return arrow;
		}
	}
	
	public void turn()
	{
		if (direction == 0)
		{
			direction = 1;
		}
		
		else
		{
			direction = 0;
		}
	}
	
	public int move()
	{
		if(direction == 0)
		{
			position = position + 1;
		}
		
		else
		{
			position = position - 1;
		}
		
		return position;
	}
}
