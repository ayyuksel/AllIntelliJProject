package day50_Polymorphism.PhoneTask;

public abstract class Phone {
    //if you apply abstract that is mean should be super class
    //final means it is constant cannot change
    //that is mean abstract and final cannot be use together
    //once you apply final to class cannot be inheritable
    // once you apply final to variable cannot be initialized
    // once you apply final to method cannot be overridden

    public String brand, model, size, color;
    public double price;

    public Phone(String brand, String model, String size, String color, double price) {
       if (price<0){
           throw new RuntimeException("invalid price, cannot be negative");
       }

        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    //abstract method do not have body
    //abstract method meant to be overridden
    public abstract void text();
    public abstract void call();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
