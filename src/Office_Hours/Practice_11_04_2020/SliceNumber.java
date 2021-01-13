package Office_Hours.Practice_11_04_2020;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SliceNumber {
    public static void main(String[] args) {

        int number = 98765;

        int digit1 = number/10000;//1
        int digit2=number%10000/1000;//2
        //       12345%10000/1000
        //         2345/1000=2
        //          345

        int digit3 =number % 10000 % 1000 /100;
        //         // 2345%1000/100
        //        //345/100=3.45

        int digit4 =number%10000%1000%100/10;

        //345%100=3.45

        //45/10=4.5
        //4


        int digit5 = number%10000%1000%100%10;
       //45%10;
        //5

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);




    }
}
