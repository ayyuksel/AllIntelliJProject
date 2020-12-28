package day38_StaticKeyword;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class Iphone {
    public String model, color, storage;
    public double price;

    public static String brand ="Apple", OS = "IOS", madeIn = "China";






    public void call(long phoneNumber){
        System.out.println("Iphone "+model+" is calling "+phoneNumber);
    }
    public static void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating system: "+ OS);
        System.out.println("Made in: "+madeIn);
    }


    public String toString(){
        return  "Brand: "+brand+", Model: "+model+", Color: "+", Price: "+price+", Operating System: "+OS;
    }





}
