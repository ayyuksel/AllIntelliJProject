package day41_Encapsulation;

public class Test {

    public static void main(String[] args) {
        System.out.println(Data.publicVariable);
        //System.out.println(Data.privateVariable);
        System.out.println(Data.defaultVariable);
        System.out.println(Data.protectedVariable);

        //Data obj = new Data();

        Data.publicMethod();
        //Data.privateMethod();
        Data.defaultMethod();

    }
}
