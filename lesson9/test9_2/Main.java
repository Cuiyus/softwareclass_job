package lesson9.test9_2;

public class Main
{
	public static void main(String[] args)
	{
		CountDisplay d = new CountDisplay(new FileDisplayImpl("star.txt"));
		d.multiDisplay(3);
	}
}
