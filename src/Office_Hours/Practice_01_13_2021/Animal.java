package Office_Hours.Practice_01_13_2021;

public abstract class Animal {//common for all classes
    public String name,  color, size;
    public final String breed;//after initialized one time you cannot changed
    public  char gender;
    public int age;
    //if you creating abstract method you don't have to give body
    public abstract void speak();
    //static can only initialized one time
    public static boolean isAnimal;
    //another way initialized static method
    static {
        isAnimal=true;
    }
    public  Animal(String name, String breed,String size, char gender, int age){
      this.name=name;
      this.breed=breed;
      this.size=size;
      this.gender=gender;
      this.age=age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
