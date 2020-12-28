package day32_LocalDate_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {
        // Primitive are not class
        // Wrapper 8 Primitive classes  you do have methods
        //Wrapper class present in java.lang no need to be imported

        byte b = 100;//Wrapper class only dedicates own primitives
        Byte b2 = b;//Auto boxing
        Integer b3 = (int) b;//Still works but byte be came int
        System.out.println(b3);

        Integer I = 20;
        double d = I;//unboxing
        //primitive data types except anything as long as its double range

        Integer num = 100;
       // Long L1 = num; Wrapper class Long does not except Wrapper class Integer
        long L1 =num;


        System.out.println("==========================================");
        //=>Autoboxing converts primitive to object;
        //=>Unboxing converts objects to primitives
        Character ch ='A';
        char ch2 = ch;//unboxing:
        int n = ch;//unboxing

        long score = 100;
        //Double d1 =(double)score;//wrapper class except only own wrapper class
        Long d1 = score;//uboxing
        Long d2 = d1;



    }
}
