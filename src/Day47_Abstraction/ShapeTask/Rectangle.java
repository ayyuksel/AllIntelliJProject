package Day47_Abstraction.ShapeTask;

public class Rectangle extends Shape{
    public double with, length;

    public Rectangle(double with, double length) {
        super("Rectangle");
        this.with = with;
        this.length = length;
    }

    @Override
    public double area() {
        return with * length;
    }

    @Override
    public double perimeter() {
        return with * 2 * length * 2;
    }
}
