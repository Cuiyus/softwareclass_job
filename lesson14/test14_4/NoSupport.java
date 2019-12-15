package lesson14.test14_4;

public class NoSupport extends Support
{
	public NoSupport(String name)
	{
		super(name);
	}

	protected boolean resolve(Trouble trouble)
	{
		return false;
	}
}
