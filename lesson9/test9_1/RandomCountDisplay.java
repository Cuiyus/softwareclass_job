package lesson9.test9_1;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay
{
	private Random random = new Random();

	public RandomCountDisplay(DisplayImpl impl)
	{
		super(impl);
	}

	public void randomDisplay(int times)
	{
		multiDisplay(random.nextInt(times));
	}
}
