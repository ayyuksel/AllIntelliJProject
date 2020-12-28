package day38_StaticKeyword;

import java.text.DecimalFormat;

public class Circle {
    public double radius, diameter, area,perimeter;

    public void setInfo(double radius){
        this.radius=radius;
        diameter =2 * radius;
        area =calculateArea();
        perimeter =calculatePerimeter();
    }

    public double calculateArea(){
        return radius * radius * Math.PI;
    }

    private double calculatePerimeter(){
        return diameter * Math.PI;
    }

   DecimalFormat df = new DecimalFormat("0.00");
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter )+
                '}';
    }

    public boolean equals(Circle circle){
        return this.radius == circle.radius;
    }







}
/*
1. create a custom class called Circle
                Attributes:
                    radius, diameter, area, perimeter
                methods:
                    calculate Area: returns the area of the circle
                    calculatePerimeter: returns the perimeter of the circle
                    setInfo: initializes all the instance of the Circle
                    toString methods

 */