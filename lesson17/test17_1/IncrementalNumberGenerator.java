package lesson17.test17_1;

public class IncrementalNumberGenerator extends NumberGenerator
{
	private int number;
	private int end;
	private int inc;

	public IncrementalNumberGenerator(int start, int end, int inc)
	{
		this.number = start;
		this.end = end;
		this.inc = inc;
	}

	public int getNumber()
	{
		return number;
	}

	public void execute()
	{
		while (number < end)
		{
			notifyObservers();
			number += inc;
		}
	}
}
