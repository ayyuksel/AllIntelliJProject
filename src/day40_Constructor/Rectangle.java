package day40_Constructor;

public class Rectangle {

    public static int numberOfSide;

    public double with ,length, area, perimeter;

    static {
        numberOfSide =4;
    }

    public Rectangle(double with, double length) {
        this.with = with;
        this.length = length;
        area =with *length;
        perimeter =(with+length)*2;
    }


    public String toString() {
        return "Rectangle{" +
                "with=" + with +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", numberOfSide="+ numberOfSide+
                '}';
    }
}
   class RectangleObject{
       public static void main(String[] args) {
           Rectangle rectangle1 = new Rectangle(3,5);

           Rectangle rectangle2 = new Rectangle(10,20);
           System.out.println(rectangle1);
           System.out.println(rectangle2);
          // System.out.println(rectangle1.numberOfSide);
           //System.out.println(rectangle2.numberOfSide);
           System.out.println(Rectangle.numberOfSide);
       }




   }