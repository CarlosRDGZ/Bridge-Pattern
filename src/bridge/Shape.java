package bridge;


public abstract class Shape
{
    // This is the implementor
    protected Color color;

    // Constructor with implementor as an argument
    public Shape(Color color)
    {
        this.color = color;
    }

    abstract public void applyColor();
}
