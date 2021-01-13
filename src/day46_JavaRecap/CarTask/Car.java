package day46_JavaRecap.CarTask;

import java.time.LocalDate;
import java.util.InputMismatchException;

public class Car {
    public static int numberOfTire;
    public static boolean hasEngine , hasSeats;
    static {
        numberOfTire=4;
        hasEngine=true;
        hasSeats=true;

    }
    public String brand, model, color;
    public int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price) {
        if(year > LocalDate.now().getYear()+1 || year<=0){
            throw new InputMismatchException("Invalid Year");
        }
        if(price<= 0){
            throw new RuntimeException("Car price con not be negative or zero"+price);
        }


        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }
    public final void drive(){
        System.out.println("driving "+brand+" "+model);
    }
}
