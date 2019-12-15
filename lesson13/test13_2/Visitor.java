package lesson13.test13_2;

public abstract class Visitor
{
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
