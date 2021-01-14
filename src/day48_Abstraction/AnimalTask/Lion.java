package day48_Abstraction.AnimalTask;

public class Lion extends Animal implements Predator{
    public Lion(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleep for 10 hours");
    }


    @Override
    //it is mandatory to override
    public void hunt() {
        System.out.println("Lion hunt deer");
    }
    public String toString(){
        return "Lion" + super.toString();
    }
}
