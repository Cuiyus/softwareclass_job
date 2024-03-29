package lesson12.test12_1;

public class UpDownBorder extends Border
{
    private char borderChar;

    public UpDownBorder(Display display, char ch)
    {
        super(display);
        this.borderChar = ch;
    }

    public int getColumns()
    {
        return display.getColumns();
    }

    public int getRows()
    {
        return 1 + display.getRows() + 1;
    }

    public String getRowText(int row)
    {
        if (row == 0 || row == getRows() - 1)
        {
            return makeLine(borderChar, getColumns());
        }
        else
        {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char ch, int count)
    {
        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < count; i++)
        {
            buf.append(ch);
        }

        return buf.toString();
    }
}
