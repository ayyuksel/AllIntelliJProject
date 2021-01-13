package Day47_Abstraction.EmployeeTask;

public abstract class Person {
    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
//method without implementation
    protected abstract void sleep();
}