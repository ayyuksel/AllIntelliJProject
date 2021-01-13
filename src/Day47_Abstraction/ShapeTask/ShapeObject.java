package Day47_Abstraction.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {
        //Shape shape = new Shape("Shape");
        //Abstract does not physically exist

        Circle circle = new Circle(3.5);
        System.out.println("Area of circle = " + circle.area());
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Area rectangle = " + rectangle.area());
        Square square = new Square(5);
        System.out.println("Area of square = " + square.area());
    }
}
