package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;
import day46_JavaRecap.CarTask.BMW;
import day46_JavaRecap.CarTask.Car;
import day46_JavaRecap.CarTask.Tesla;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Shape;

public class PolymorphismRules {
    public static void main(String[] args) {
//rule 1- reference type decides  what  can  be call == class
        //object type one to decided what implementation can be execute==object
        //

        Dog dog = new Dog("a", "husky",'M',12, "white","small");
        dog.bark();
        Animal animal = new Dog("a", "husky",'M',12, "white","small");
        //animal.bark();
        animal.eat("food");//implementation from dog class

        System.out.println("-------------------------------------------");
        //regardless of reference always overridden method/object will be execute
        Cube cube = new Cube(5);

        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        Shape shape = new Cube(5);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        //System.out.println(shape.volume());

        System.out.println("------------------------------------------------");

        Car car = new Tesla("Model 3", "white", 2019, 45000);
        //car.autoPilot();
        car.start();

        Car car2 = new BMW("X5", "red", 2018, 55000);
        car2.start();

        System.out.println("--------------------------------------------------");
//once we change reference type we can call the method therefore we need to casted
        Animal animal2 = new Dog("Lucy", "husky",'M',12, "white","small");

        //animal2.bark();



    }
}
