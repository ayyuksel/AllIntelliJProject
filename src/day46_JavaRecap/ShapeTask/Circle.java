package day46_JavaRecap.ShapeTask;

public class Circle extends Shape{
    private final static double PI = 3.14;//internal use
public double r, d;

public Circle(double r){

    super("Circle");
    //if radius circle is invalid
    if(r<0)throw new RuntimeException("No such a Circle in radius: "+r);
    setR(r);   //this.r=r;
    setD(r*2); //d=r*2;



}

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return d * PI;
    }
}
