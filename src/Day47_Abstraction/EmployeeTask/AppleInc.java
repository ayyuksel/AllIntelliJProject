package Day47_Abstraction.EmployeeTask;

import Day47_Abstraction.CarTask.Tesla;

public class AppleInc {
    public static void main(String[] args) {
        // Person person = new Person("person  a",28,'M');
        //Employee employee = new Employee("John",24,'M',"tester","shshkshsk",230000)

        Tester tester = new Tester("Ayse", 36, 'F', "SDET", "13add", 160000);

        Developer developer = new Developer("Ayse", 36, 'F', "SDET", "13add", 160000);

        UberDriver uberDriver = new UberDriver("John", 36, 'F', "Driver", "13add", 160000);


        tester.work();
        tester.sleep();

        developer.work();
        developer.sleep();

        uberDriver.work();
        uberDriver.sleep();


        System.out.println("uberDriver = " + uberDriver);
        System.out.println("developer = " + developer);
        System.out.println("tester = " + tester);
    }
}
