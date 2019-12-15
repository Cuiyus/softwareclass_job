package lesson6;

public class UnderlinePen extends ParentClass
{

    private char ulchar;

    public UnderlinePen(char ulchar)
    {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s)
    {
        int length = s.getBytes().length;

        System.out.println("\"" + s + "\"");
        System.out.print(" ");

        for(int i = 0; i < length + 4; i++)
        {
            System.out.print(ulchar);
        }
        System.out.println("");
    }
}
