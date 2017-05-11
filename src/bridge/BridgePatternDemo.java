package bridge;

public class BridgePatternDemo
{
    public static void main(String[] args)
    {
        Shape tri = new Triangle(new PurpleColor());
        Shape sqr = new Square(new RedColor());
        Shape cir = new Circle(new BlueColor());
        tri.applyColor();
        sqr.applyColor();
        cir.applyColor();
    }
}
