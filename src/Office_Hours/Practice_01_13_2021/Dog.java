package Office_Hours.Practice_01_13_2021;

public final class Dog extends Animal {

    public Dog( String breed, String size, char gender, int age) {
        super("Dog", breed, size, gender, age);
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof ");
    }

    @Override
    protected void play() {
        System.out.println("Plays fetch");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    @Override
    //We override by calling super class
    public String toString(){
        return "Dog " + super.toString();
    }

}
