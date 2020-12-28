package library;

import day41_Encapsulation.Data;

import static day41_Encapsulation.Data.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(Data.publicVariable);
        //System.out.println(Data.defaultVariable);
        //System.out.println(Data.protectedVariable);
        //System.out.println(Data.privateVariable);

       // obj1 = new Data();

        //Data obj = new Data();

        Data.publicMethod();
        //Data.privateMethod();
        //Data.defaultMethod();

    }
}
