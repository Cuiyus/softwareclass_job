package lesson23.test23_1.language;

public abstract class Node implements Executor
{
	public abstract void parse(Context context) throws ParseException;
}
