package lesson7.test7_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder
{
    private String filename;

    private PrintWriter writer;

    protected void createTitle(String title)
    {
        filename = title + ".html";
        try
        {
            writer = new PrintWriter(new FileWriter(filename));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");

        writer.println("<h1>" + title + "</h1>");
    }
    protected void createString(String str)
    {

        writer.println("<p>" + str + "</p>");
    }
    protected void createItems(String[] items)
    {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++)
        {
            writer.println("<li>" + items[i] + "</li>");
        }

        writer.println("</ul>");
    }
    protected void createDone()
    {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult()
    {
        return filename;
    }
}
