package selfPractice;

import java.time.LocalDate;

public class DogObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();


        dog1.setInfo("Tima", "York","small",'M',"multiColor", LocalDate.of(2019,12,01));

        dog1.getInfo();

    }
}
