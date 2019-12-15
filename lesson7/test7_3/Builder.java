package lesson7.test7_3;

public abstract class Builder
{
    private boolean initialized = false;

    public void makeTitle(String title)
    {
        if (!initialized)
        {
            createTitle(title);
            initialized = true;
        }
    }

    public void makeString(String str)
    {
        if (initialized)
        {
            createString(str);
        }
    }

    public void makeItems(String[] items)
    {
        if (initialized)
        {
            createItems(items);
        }
    }

    public void close()
    {
        if (initialized)
        {
            createDone();
        }
    }
    protected abstract void createTitle(String title);
    protected abstract void createString(String str);
    protected abstract void createItems(String[] items);
    protected abstract void createDone();
}
