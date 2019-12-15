package lesson12.test12_1;

public abstract class Border extends Display
{
    protected Display display;

    protected Border(Display display)
    {
        this.display = display;
    }
}
