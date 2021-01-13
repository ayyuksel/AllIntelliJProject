package Office_Hours.Practice_01_13_2021;

public class Zoo {
    public static void main(String[] args) {

//abstract class you cannot create an object
        //Animal animal = new Animal("animal", "breed", "size", 'G', 11);

    Dog dog = new Dog("Husky","medium",'M',7);
    //dog.breed="Husky";it is final cannot change
    dog.name="Erik";
    Cat cat = new Cat("Garfield","gold","small",'M',4);
    Shark shark = new Shark("GXX","White","Large",'F',12);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(shark);
        dog.speak();
        cat.speak();
        shark.speak();
        dog.play();
        cat.play();
        shark.play();

    }
}