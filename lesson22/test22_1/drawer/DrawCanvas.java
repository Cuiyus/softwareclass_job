package lesson22.test22_1.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import lesson22.test22_1.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable
{
	private Color color;

	private int radius;

	private MacroCommand history;


	public DrawCanvas(int width, int height, MacroCommand history)
	{
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
		init();
	}

	public void paint(Graphics g)
	{
		history.execute();
	}


	public void init()
	{
		color = Color.red;
		radius = 6;
		history.append(new ColorCommand(this, color));
	}


	public void draw(int x, int y)
	{
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}

	public void setColor(Color color)
	{
		this.color = color;
	}
}
