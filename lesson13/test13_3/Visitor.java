package lesson13.test13_3;

public abstract class Visitor
{
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
