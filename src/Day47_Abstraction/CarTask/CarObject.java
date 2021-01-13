package Day47_Abstraction.CarTask;

public class CarObject {
    public static void main(String[] args) {

       // Car car = new Car()//Car' is abstract; cannot be instantiated

        Mercedes mercedes = new Mercedes("G class", "red", 2018,45000);

        Toyota toyota = new Toyota("Corolla","grey",2020,25000);

        Tesla tesla = new Tesla("model 3","white", 2021, 49000);

        BMW bmw = new BMW("X5","Blue",2015,30000);

        System.out.println("start mercedes: ");
        mercedes.start();

        System.out.println("Start toyota: ");
        toyota.start();

        System.out.println("Start tesla: ");
        tesla.start();

        System.out.println("Start BMW: ");
        bmw.start();
    }
}