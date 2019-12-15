package lesson21.test21_1;

public class PrinterProxy implements Printable
{
	private String name;
	private Printable real;
	private String className;

	public PrinterProxy(String name, String className)
	{
		this.name = name;
		this.className = className;
	}

	public synchronized void setPrinterName(String name)
	{
		if (real != null)
		{
			real.setPrinterName(name);
		}

		this.name = name;
	}

	public String getPrinterName()
	{
		return name;
	}

	public void print(String string)
	{
		realize();
		real.print(string);
	}
	
	private synchronized void realize()
	{
		if (real == null)
		{
			try
			{
				real = new Printer();
				real.setPrinterName(name);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
