package Day47_Abstraction.EmployeeTask;

public final class UberDriver extends Employee{
    public UberDriver(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("Drive the car");
    }

    @Override
    public void sleep() {
        System.out.println("They sleep 5 hours");
    }
}
