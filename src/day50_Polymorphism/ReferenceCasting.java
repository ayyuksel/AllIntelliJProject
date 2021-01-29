package day50_Polymorphism;

import Day47_Abstraction.ShapeTask.Circle;
import Day47_Abstraction.ShapeTask.Shape;
import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Cylinder;

public class ReferenceCasting {
    public static void main(String[] args) {
        //implicit casting : done automatically--> smaller to larger
        int a =100;
        double b = a;

        //explicit casting : it is done manually--> casting larger to smaller
        double d = 10.5;
        int c =(int) d;

        System.out.println("--------------------------------------------------");
        //upcasting: smaller type to larger reference type
        Circle circle = new Circle(3);
        Shape shape = (Shape)circle;

        WebDriver driver = new ChromeDriver();
        //down casting : larger reference type  to smaller. Must be done manually

        Animal animal = new Dog("Lucy", "husky",'M',12, "white","small");
        //animal.bark();
        //Polymorphisms is a relation
        //Dog dog = (Dog)animal;
        //dog.bark();
        //((Dog) animal).bark();

        Animal animal2 = new Cat( "Lucy", "husky",'M',12, "white","small");


        ((Cat)animal2).meow();


        System.out.println("------------------------------------------------------- ");










    }
}
