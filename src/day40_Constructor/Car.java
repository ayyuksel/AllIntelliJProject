package day40_Constructor;

public class Car {
    /*
    /*
Constructors
*•Constructor is a special method that MUST matches the name of the class and has no return type nor a specifier.
*A special method that every class MUST have(Default Constructor)
*It’s used when we create the objects of a class
*We can use constructors to initialize the object’s instance variables.
*Execution of a constructor ALWAYS depends on the object(gets executed when we create the object)
 */

        /*
        Types of Constructors
        •No-argument Constructor: A constructor that has no parameter is known as default constructor.
        If we do not define a constructor in a class, then compiler creates default constructor(with no argument) for the class.
        •Parameterized Constructor: A constructor that has parameters is known as parameterized constructor.
        If we want to initialize fields of the class with our own values, then we pass parameters to the  constructor.
         */

        /*
        Constructors Overloading
        *We can have multiple constructors in a class by implementing method overloading
         */

        /*
        Constructor call: this()
            * only a constructor can call another constructor(other methods can NOT call constructor)
            * constructor can be overloaded. the only way to have more than one constructor in class
            * constructor can NOT be called by constructor name. We need "this()"
            * constructor call MUST be at first step
            * one constructor can ONLY call one constructor
            * Constructor cannot call or contain itself
         */




    public String brand , model, color;
    public int year;
    public double price;


    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year) {

        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
       this(brand, model, year);
        this.price = price;
    }


    public Car(String brand, String model, String color, int year, double price) {
        this(brand, model, year, price);
        this.color = color;
    }
}
