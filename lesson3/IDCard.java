package lesson3;

public class IDCard extends Product
{
    private String owner;
    private static int number = 0;

    IDCard(String owner)
    {
        number++;

        System.out.println("制作" + owner + "的 ID 卡");
        System.out.println(owner + "卡片序号" + number);
        this.owner = owner;
    }

    @Override
    public void use()
    {
        System.out.println("使用" + owner + "的 ID 卡");
    }

    public String getOwner()
    {
        return  owner;
    }
}
