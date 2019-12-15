package lesson7.test7_3;

public class TextBuilder extends Builder
{
    private StringBuffer buffer = new StringBuffer();

    protected void createTitle(String title)
    {
        buffer.append("==============================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    protected void createString(String str)
    {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    protected void createItems(String[] items)
    {
        for (int i = 0; i < items.length; i++)
        {
            buffer.append("　・" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    protected void createDone()
    {
        buffer.append("==============================\n");
    }

    public String getResult()
    {
        return buffer.toString();
    }
}
