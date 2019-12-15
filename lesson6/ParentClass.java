package lesson6;

public class ParentClass implements Product
{

    @Override
    public void use(String s)
    {

    }

    @Override
    public Product createClone()
    {
        Product p = null;

        try
        {
            p = (Product)clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return p;
    }
}
