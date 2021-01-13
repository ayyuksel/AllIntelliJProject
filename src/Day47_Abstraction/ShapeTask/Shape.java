package Day47_Abstraction.ShapeTask;

public abstract class Shape {//not concrete.
    public String name;

    public Shape(String name) {
        this.name = name;
    }
    //abstract means without body
    //you can only apply abstract to class and method
    //we will be create the method with zero implementation
    //you cannot create obj from abstract class
    //supper class focus on essential
    //sub class focus on details
    public abstract double area();
    public abstract double perimeter();
}


