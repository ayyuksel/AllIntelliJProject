package day43_Inheritance.CarTask;

public class Car {

    public String brand, model, color, madeIn;
    public int year;
    public double miles, price;

    public static boolean hasEngine, hasWheel, hasTires;

    static {
        hasEngine=true;
        hasWheel=true;
        hasTires=true;

    }

    public void setInfo(String brand, String model, String color, String madeIn, int year, double miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.madeIn = madeIn;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }
    public void drive(){
        System.out.println("driving "+brand+" "+madeIn);
    }

    public void park(){
        System.out.println("parking "+brand+" "+madeIn);
    }
    public String toString(){
        return  year+" "+brand+" "+model+" "+color+" "+miles+" miles, $"+price;
    }


}
