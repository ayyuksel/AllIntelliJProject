package day07_UnaryOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        short a =3000;
        long b= a;//implicit casting, automatically done
        //3000l

        int c= (int)b; // explicit casting, must be done manually

        double d1 =200.5;
        int i1 =(int)d1;
        System.out.println(i1);


        long l1 = 100;
        short s1 =(short)l1;//explicit casting

        double d2 =300;
        float f1 = (float) d2;

        long l2 = 300;// implicit casting

        int i2 = (int) l2;

        short s2 = 400;
        byte b1 = (byte) s2;
        System.out.println(b1);//the value out of byte range casting does not change the result

        long l3 =100;
        byte b2 = (byte) l3;
        System.out.println(b2);



    }
}
