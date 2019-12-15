package lesson17.test17_1;

public class DigitObserver implements Observer
{
	public void update(NumberGenerator generator)
	{
		System.out.println("DigitObserver:" + generator.getNumber());
		try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException e)
		{
		}
	}
}
