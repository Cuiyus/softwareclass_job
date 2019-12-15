package lesson12.test12_2;

public abstract class Border extends Display
{
    protected Display display;

    protected Border(Display display) { // 在生成实例时通过参数指定  被装饰物
        this.display = display;
    }
}
