package day50_Polymorphism;

import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.CybertekDriver;
import day49_Abstraction.RemoteDriverTask.FireFoxDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Rectangle;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.Iphone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;

public class PolymorphismIntro {
    //parent/super references the child
    //parent can be reference the child as long as there IS A RELATION
    public static void main(String[] args) {
        //Iphone iphone1 = new Iphone("Iphone 12", "Small" ,  "Black", 1000);
        //Samsung samsung1 = new Samsung("Galaxy S20", "Medium", "White", 900);
        Phone phone1 = new Samsung("Galaxy S21", "Medium", "White", 900);
        Phone phone2 = new Iphone("Iphone 12", "Small" ,  "Black", 1000);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Iphone("Iphone 12", "Small" ,  "Black", 1000));
        phones.add( new Samsung("Galaxy S21", "Medium", "White", 900));


        Shape shape;
        shape = new Circle(3);
        System.out.println(shape.area());
        shape= new Rectangle(3,4);
        System.out.println(shape.area());
        shape= new Cube(5);
        System.out.println(shape.area());


        System.out.println("-----------------------------------------------------");

        String browserName = "chrome";
        WebDriver driver;

        switch (browserName){
            case "firefox" :
                driver=new FireFoxDriver();
                break;
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "cybertek":
                driver=new CybertekDriver();
                break;
            default:
                throw new RuntimeException("invalid browser name!!!");
        }

        System.out.println("---------------------------------------------------------");








    }
}
