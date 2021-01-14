package day48_Abstraction.AnimalTask;

public final class Shark extends Animal implements Predator, Swimmable {
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleep 0 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Shark hunts fish");
    }

    @Override
    public void swim() {
        System.out.println("Shark can swim very fast");
    }

    public String toString(){
        return "Shark" + super.toString();
    }
}
