package lesson7.test7_1;

import lesson7.test7_1.Builder;

public class Director
{
    private Builder builder;

    public Director(Builder builder)
    {
        this.builder = builder;
    }

    public void construct()
    {
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[]{"早上好。", "下午好。", "晚安。", "再见。"});

        builder.close();
    }
}
