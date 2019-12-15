package lesson23.test23_1.language;


public class CommandNode extends Node
{
	private Node node;

	public void parse(Context context) throws ParseException
	{
		if (context.currentToken().equals("repeat"))
		{
			node = new RepeatCommandNode();
			node.parse(context);
		}
		else
		{
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
	}

	public void execute() throws ExecuteException
	{
		node.execute();
	}

	public String toString()
	{
		return node.toString();
	}
}
