package lesson9.test9_1;

public class Main
{
	public static void main(String[] args)
	{
		RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, China."));
		d.randomDisplay(10);
	}
}
