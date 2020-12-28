package day35_CustomClassIntro;

public class CarObject {
    //we need run that why need method

    public static void main(String[] args) {
        Car car1 = new Car();//has own brand
        Car car2 = new Car();//has own brand
        Car car3 = new Car();//has own brand

//if it instance you can call through class name
        car1.brand="Toyota";//first copy
        car2.brand="BMW";//second copy
        car3.brand="Lexus";//third copy



        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.brand);

        //String str1 ="Toyata";
        //String str2 = "BMW";
        //String str3= "Lexus";

        car1.model = "Corolla";
        car2.model = "i8";
        car3.model = "RX";

        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);

        Car car4 = new Car();
        car4.setInfo("Mecedes","C300","Red",2018,30000);
        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.year);
        System.out.println(car4.year+" "+car4.brand+" "+car4.model+" "+car4.color);








    }
}
