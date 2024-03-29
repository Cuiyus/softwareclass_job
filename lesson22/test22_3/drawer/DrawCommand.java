package lesson22.test22_3.drawer;

import java.awt.Point;

import lesson22.test22_3.command.Command;

public class DrawCommand implements Command
{
	protected Drawable drawable;

	private Point position;


	public DrawCommand(Drawable drawable, Point position)
	{
		this.drawable = drawable;
		this.position = position;
	}


	public void execute()
	{
		drawable.draw(position.x, position.y);
	}
}
