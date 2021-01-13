package Office_Hours.Practice_01_13_2021;

public final class Cat extends Animal{
    public Cat(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");

    }

    @Override
    protected void play() {
        System.out.println("Play with balls");
    }

    public String toString(){
        return "Cat"+super.toString();
    }
}
