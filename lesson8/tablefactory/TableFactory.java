package lesson8.tablefactory;

import lesson8.factory.Factory;
import lesson8.factory.Link;
import lesson8.factory.Page;
import lesson8.factory.Tray;

public class TableFactory extends Factory
{
	public Link createLink(String caption, String url)
	{
		return new TableLink(caption, url);
	}

	public Tray createTray(String caption)
	{
		return new TableTray(caption);
	}

	public Page createPage(String title, String author)
	{
		return new TablePage(title, author);
	}
}
