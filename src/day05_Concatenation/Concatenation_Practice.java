package day05_Concatenation;

public class Concatenation_Practice {
    public static void main(String[] args) {
        int houseNumber = 3444;
        String streetName= "Johns Brach Dr";
        String cityName="Mclean";
        String state="VA";
        int zipCode=22333;

        String fullAddress=houseNumber+" "+streetName+"\n"+cityName+" "+streetName+", "+zipCode;
        System.out.println(fullAddress);

        System.out.println("=====================================");
        String brand= "Toyata";
        String model = "Camry";
        int year = 2010;
        int mileage= 55000;
        double price= 18000;
        String color ="Red";

        String carInfo=year+" "+brand+" "+model+", "+mileage+" miles,"+color+", "+price;

        System.out.println(carInfo);


    }
}
