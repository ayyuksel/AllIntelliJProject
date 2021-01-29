package day49_Abstraction.RemoteDriverTask;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day43_Inheritance.CarTask.BMW;
import day43_Inheritance.CarTask.Car;
import day43_Inheritance.CarTask.Toyota;
import day45_Exceptions.PhoneTask.Iphone;
import day45_Exceptions.PhoneTask.Phone;
import day45_Exceptions.PhoneTask.Samsung;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Shape;

public class DownCasting {
    public static void main(String[] args) {
        Shape shape = new Cylinder(3,5);
        //shape.volume();//reference type we don't have it
        //Cylinder cylinder = (Cylinder) shape;
        //System.out.println(cylinder.volume());
        //System.out.println(cylinder);


        double volume = ((Cylinder) shape).volume();
        System.out.println(volume);

//in polymorphism parent cannot reference to child

        Animal animal = new Cat("a", "husky",'M',12, "white","small");

        //((Dog)animal).bark();
Car car = new Toyota("Camry", "white", 2020,4500,3500);

  //      ( (BMW)car).race();

        Phone phone = new Samsung("S20", 1000);
        //(Iphone)phone.faceTime(12234556);

        System.out.println("---------------------------------------");

        WebDriver driver = new ChromeDriver();
        ((TakeScreenShot)driver).TakeScreenShot("pic");
        ((JavaScriptExecuter)driver).executeScript("sfdf");
        System.out.println("-------------------------------");
        Shape shape2 = new Circle(3);
        ((Cube)shape2).volume();
        System.out.println("======================");
        ((TakeScreenShot) driver).TakeScreenShot("");
        ((JavaScriptExecuter) driver).executeScript("");

        RemoteDriver dr1 = new FireFoxDriver();//upcasting
        JavaScriptExecuter js = new FireFoxDriver();
        TakeScreenShot ts = new FireFoxDriver();

boolean isChrome = driver instanceof ChromeDriver;

    }
}
