package day35_CustomClassIntro;

public class Car {
//instance variable declared outside of class
    public String brand;//instance variables
    public String model;
    public String color;
    public int year;
    public double price;
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){ // Instance methods
        brand =  carBrand;//assign brand of the car
        model = carModel;
        color = carColor;
        year = carYear;
        price =carPrice;
    }

    public void getInfo() {//prints information
        System.out.println(year + " " + brand + " " + model + " " + color+" "+price);

    }


}
