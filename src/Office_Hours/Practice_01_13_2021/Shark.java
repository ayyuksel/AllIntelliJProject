package Office_Hours.Practice_01_13_2021;

public final class Shark extends Animal{

    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void speak() {
        System.out.println("dododododo");
    }

    @Override
    protected void play() {
        System.out.println("Plays with people");
    }

    public String toString(){
        return "Shark"+super.toString();
    }
}
