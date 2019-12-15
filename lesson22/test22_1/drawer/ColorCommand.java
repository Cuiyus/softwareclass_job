package lesson22.test22_1.drawer;

import java.awt.Color;

import lesson22.test22_1.command.Command;

public class ColorCommand implements Command
{
	protected Drawable drawable;

	private Color color;

	public ColorCommand(Drawable drawable, Color color)
	{
		this.drawable = drawable;
		this.color = color;
	}

	public void execute()
	{
		drawable.setColor(color);
	}
}
